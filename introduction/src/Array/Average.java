package Array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of numbers");
		int n = sc.nextInt();
		System.out.println("enter number"); 
		
		int marks[]= new int[n];
		
		for(int i = 0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
			
		}
		int averageMarks = 0;
		for(int i = 0; i<n; i++) {
			averageMarks += marks[i];
		}
		averageMarks /= n;
		System.out.println(averageMarks);
	}

}
