package NestedforLoops;

import java.util.Scanner;

public class AdvancePattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=2*(n-i); j++) {
//					Or use j<=n-i
				System.out.print(" ");
//					then here use("  ")...2space
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}

}
