package practice;

public abstract interface BMW   {
	
	 abstract void normal();
	 default void color() {
		 System.out.println("White");
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
