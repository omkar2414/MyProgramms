package peopke;

public class Customer extends Admin {
	
	public Customer(String name, int rollnumber) {
		super(name, rollnumber);
	}
	public void getAdmission() {
		super.getAdmission();
		System.out.println(" admission success 2");
	}
//		String name;
//		public static int id;
//		String productName;
//		
//		public Customer(int id, String name, String productName){
//			this.id = id;
//			this.name = name;
//			this.productName = productName;
//		}
//		public static void getInfo() {
//			if(id < 10) {
//				System.out.println("old customer");
//			}else {
//				System.out.println("new  customer");
//			}
//
//		}

	public static void main(String[] args) {
		
//		Customer obj = new Customer(14,"om","puma");
//		getInfo();
		Teacher obj1 = new Teacher("Omkar", 98);
		obj1.getAdmission();
		
	}

}
