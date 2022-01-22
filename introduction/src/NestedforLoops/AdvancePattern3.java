package NestedforLoops;

import java.util.Scanner;

public class AdvancePattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int row = 2*n-1;
		
		
			for(int i = 1; i<=row; i++) {
				if(i<=4) {
				for(int j = 1; j<=i; j++) {
					System.out.print("* ");
				}
			}
			else {
			for(int k =1; k<=row-i+1; k++) {
				System.out.print("* ");
			}
		}
			System.out.println();
			
	}
}
}