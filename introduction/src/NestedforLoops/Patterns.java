package NestedforLoops;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i =1; i<=2; i++) {
			for(int j=1; j<=i; j++) {
				if(i==1) {
					System.out.println("* ");
				}
				if(j==2)
					System.out.println("* * ");
			}
	}

	}
}
