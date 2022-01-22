package Calculater;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter operation");
		sc.nextLine();
		char c = sc.nextLine().charAt(0);
		int result = 0;
		
		switch(c) {
			case '+':
				result = a+b;
				break;
			case '-':
				result = a-b;
				break;
			case '*':
				result = a*b;
				break;
			case '/':
				result = a/b;
				break;
			default :
				System.out.println("Invalid operation");
				break;
				
				
		}
		System.out.println("your result is"+result);
		
	}
	
	}