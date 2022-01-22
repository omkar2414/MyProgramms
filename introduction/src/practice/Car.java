package practice;

public class  Car implements BMW, Mercedez {

	
	

	
	public static void main(String[] args) {
		
		
		
		Car obj = new Car();
		BMW obj1 = obj;
		
		obj1.color();
		
		obj.speed();
		obj.normal();
		obj.style();
		obj.color();
		

	}

	@Override
	public void speed() {
		System.out.println("120");
		
	}

	@Override
	public void style() {
		System.out.println("cedan");
	}

	@Override
	public void normal() {
		System.out.println("its not a normal car");
	}
	
	
	public void color() {
		System.out.println("Yellow");
	}
	
	

}
