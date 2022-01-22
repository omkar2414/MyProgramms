package Array;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter metrix dimension");
		int raw = sc.nextInt();
		int cols = sc.nextInt();
		
		int a[][] = new int[raw][cols];
		int b[][] = new int[raw][cols];
		
		if (a == b) {
		
		System.out.println("Enter a");
		
		for(int i = 0; i<raw; i++) {
			for(int j = 0; j<cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter b");

		for(int i = 0; i<raw; i++) {
			for(int j = 0; j<cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		 int c[][] = new int[raw][cols];
		 for(int i = 0; i<raw; i++) {
				for(int j = 0; j<cols; j++) {
		 c[i][j] = a[i][j] * b[i][j];
	}
		 }
		 System.out.println("Result array c is ");
		 for(int i = 0; i<raw; i++) {
				for(int j = 0; j<cols; j++) {
					System.out.print(c[i][j] +" ");
				}
				System.out.println();
}
		}else {
			 System.out.println("rows and cols not matched");
		 }
}
}