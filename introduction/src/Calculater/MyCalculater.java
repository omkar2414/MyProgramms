package Calculater;
import java.util.Scanner;
public class MyCalculater {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int result=0;
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("enter your second number");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter operation which you wnat to perform");
		char c = sc.nextLine().charAt(0);
		
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
		default:
			System.out.println("invalid operation");
		}
		System.out.println("Answer"+result);
	}

}
