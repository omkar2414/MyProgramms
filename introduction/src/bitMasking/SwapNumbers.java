package bitMasking;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 24;
		int b = 14;
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a+" "+b);
	}

}
