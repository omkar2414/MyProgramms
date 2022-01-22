package typeCasting;
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float simpleIntrest = a*b*c/100;
		
		System.out.println(simpleIntrest);

	}

}
