package String;

import java.util.Scanner;

public class ReverseString {
	String s = "The omkar";
	
	public  String reverseWords(String s) {
		
		int i = s.length()-1;
		String ans = "";
		
		while(i>=0) {
			while(i>=0 && s.charAt(i) ==' ')i--;
			int j = i;
			
			if(i<0) break;
			while(i>=0 && s.charAt(i) != ' ')i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1,j+1));
			}else {
				ans = ans.concat(" "+s.substring(i+1,j+1));
			}
		}
		return ans;
	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		 
//		int a = sc.nextInt();
//		reverseWords("Omkar omm");
//		
//		return;

		
		 
	}

}
