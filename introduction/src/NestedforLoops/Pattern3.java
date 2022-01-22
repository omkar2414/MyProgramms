package NestedforLoops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


//Method 2 (Anuj bhaiya)
//
//public static void main(String[] args) {
//	Scanner sc =  new Scanner(System.in);
//	
//	int n = sc.nextInt();
//	
//	for(int i = 1; i<=n; i++) {
//		for(int j = 1; j<=n-i+1; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//}
//
//}
