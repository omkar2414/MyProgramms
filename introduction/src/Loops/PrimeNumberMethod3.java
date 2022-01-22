package Loops;
import java.util.Scanner;

public class PrimeNumberMethod3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			boolean isPrime = true;
			
			for(int i = 2; i*i<n; i++) {
//				i< under root n
//				i.e i*i<n
				
				if(n % 2 == 0) {
					isPrime = false;
					break;
				}
			
			}
			if(n<2) isPrime = false;          
//			incase you have only 1 condition on IF statment then brackets is not mandatory
			
			System.out.println("isPrime"+ isPrime);
		}
		
	}


