package WhileLoop;

import java.util.Scanner;

public class CalHowManydigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int number = (int) Math.log10(n)+1;
		System.out.println(number);
	}

}
