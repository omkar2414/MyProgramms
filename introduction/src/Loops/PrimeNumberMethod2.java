package Loops;
import java.util.Scanner;

public class PrimeNumberMethod2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i = 2; i*i<n; i++);
		if(n % 2 == 0) {
			System.out.println("false");
			}
		else if(n<2) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}

}
