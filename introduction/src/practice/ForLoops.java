package practice;
import java.util.*;

public class ForLoops {
	

	public static void main(String[] args) {
		
		String a = "amn";
		String b = "amn";
		boolean isAnagram = true;
		
		int[] al = new int[256];
		
		for(int c : a.toCharArray()) {
			int index = (int) c;
			al[index]++;
			System.out.println(al[index]);
		}
		for(int c : b.toCharArray()) {
			int index = (int) c;
			al[index]--;
			System.out.println(al[index]);
		}
		for(int i = 0; i<=256; i++) {
			if(al[i] != 0) {
				isAnagram = false;
			
				break;
			}
		
//		boolean[] visited = new boolean[b.length()];
//		
//		if(a.length() == b.length()) {
//			for(int i =0; i< a.length(); i++) {
//				char c = a.charAt(i);
//			
//				for(int j = 0; j< b.length(); j++) {
//					if(b.charAt(j) == c && !visited[j]) {
//					visited[j] =true;
//					isAnagram = true;
//					break;
				
			if(!isAnagram) {
				break;
			}
		}
	
			if(isAnagram) {
				System.out.println("angram");
			}else {
				System.out.println("not anagram");
			}
	}
}
		
		

			
			

