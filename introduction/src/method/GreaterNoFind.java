package method;

import java.util.Scanner;

public class GreaterNoFind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		Find(firstNumber, secondNumber);
	}

	 static int Find(int a, int b) {
		 if(a>b) {
			 System.out.println(a+" "+"is greater");
		 }else if(a == b){
			 System.out.println("both number are to be equal");
		 }else {
			 System.err.println(b+" "+"is greater");
		 }
		return 0;
		
		 
	}
}
