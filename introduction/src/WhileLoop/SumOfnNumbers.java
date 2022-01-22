package WhileLoop;

import java.util.Scanner;

public class SumOfnNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp > 0) {
			int lastdigit = temp%10;
			sum +=lastdigit;
			temp /= 10;
			
		}
		System.out.println("the sum of digit"+" " + n +" "+ "is" + " " +sum );
	}

}
