package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileSearch
{

static String key = "";

public static void main(String[] args)
{  
if(args.length != 2)
{
System.out.println("Error: Wrong number of arguments!");
return;
}
String maindirpath = args[0];

key = args[1];

File maindir = new File(maindirpath);

if(maindir.exists() && maindir.isDirectory())
{
File arr[] = maindir.listFiles();

System.out.println("**********************************************");
System.out.println("Files from main directory : " + maindir);
System.out.println("**********************************************");

RecursivePrint(arr,0,0);
}
}

static void RecursivePrint(File[] arr,int index,int level) 
{
if(index == arr.length)
return;

for (int i = 0; i < level; i++)
System.out.print("\t");

if(arr[index].isFile())
{
int count = 0;
try
{
BufferedReader br = new BufferedReader(new FileReader(arr[index]));
for (String line = br.readLine(); line != null; line = br.readLine()) 
{
for(int i = 0; i < line.length(); i++)
{
int k = 0;
for(int j = i; j < line.length() && k < key.length(); j++, k++)
{
if(line.charAt(j) != key.charAt(k))
{
break;
}
}
if(k == key.length())
{
count++;
}
}
}
br.close();
}
catch(Exception e)
{
System.out.println(e);
}

System.out.println(arr[index].getName() + ": \"" + key + "\" occurs " + count + " times.");
}
else if(arr[index].isDirectory())
{
System.out.println("[" + arr[index].getName() + "]");

RecursivePrint(arr[index].listFiles(), 0, level + 1);
}

RecursivePrint(arr,++index, level);
}
}
