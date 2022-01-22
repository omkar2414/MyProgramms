package condition;
import java.util.Scanner;

public class ifCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age ");

		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("you are eligibal");

			} else {
			System.out.println("you are not eligible");
			}

}
}