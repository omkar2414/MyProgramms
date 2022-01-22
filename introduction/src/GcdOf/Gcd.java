package GcdOf;
import java.util.Scanner;

public class Gcd {

		public static void main(String[] args)   
	{  
			Scanner sc = new Scanner(System.in);
	int m =sc.nextInt(); 
	int n = sc.nextInt();;
	int r = 1;
	for(int i = 1; i <= m && i <= n; i++)  
	{  
	if(m%i==0 && n%i==0)  
	r = i;  
	}  
	System.out.printf("GCD of %d and %d is: %d", m, n, r);  
	}  
	}  