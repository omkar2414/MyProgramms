package IfElse;

import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		
		result = a > b ? a > c ? a : c : b > c ? b : c; 

		System.out.println("greater number is "+" "+ result);
	}
}

