package staticConcepts;

public class StaticBlocks {
	
	static {
		System.out.println("block 1");
	}
	static {
		System.out.println("block 2");
	}

	public static void main(String[] args) {
		
		System.out.println("main method");
		
		}
	
	static {
		System.out.println("block 3");
	}
}
