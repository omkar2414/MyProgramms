package typeCasting;
import java.util.Scanner;

public class TypeCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a+b;
		
		if (c <100) {
			System.out.println("your answer is small"+c);
		} else if (c< 200 || c>150) {
			System.out.println("your anwer is greater than in between 100 to 150");
		} else {
			System.out.println("your answer is bigger"+c);
			
		}
		
	}
				
}	