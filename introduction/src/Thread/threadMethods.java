package Thread;

public class threadMethods {

	public static void main(String[] args) {
		
		System.out.println("programme starting...");
		int x=14+24;
		System.out.println(x);
		
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println(tname);
		
		t.setName("NoMain");
		System.out.println(t.getName());
		
		System.out.println(t.getId());
		System.out.println("programme ending...");

		
	}

}
