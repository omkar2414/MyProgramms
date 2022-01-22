package method;

public class PassByValue {

	public static void main(String[] args) {
		
		int c = 24;
		int d = 1;
		
		swap(c, d);
		
		System.out.println(c+"  "+d);
	}
	
		static void swap(int a, int b) {
			int temp = a;
			b = a;
			a = temp;
		
	}
}
