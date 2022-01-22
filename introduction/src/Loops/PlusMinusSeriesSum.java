package Loops;
import java.util.Scanner;

public class PlusMinusSeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float result = 0;
//		float data bcz if i use int it return base value 0
		
		
		for(float i = 1; i<=n; i++) {
			if(i%2==0) {
				result = result-1/i;
			}
			else {
				result = result+1/i;
			}
		}
		
		System.out.println(result);
	}

}
