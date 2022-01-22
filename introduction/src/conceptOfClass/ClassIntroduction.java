package conceptOfClass;

class Cat{
	String breed, color;
	boolean hasfar;
	int legs, eyes;
	
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void description() {
		System.out.println("my cat has" +legs+ "legs and" +eyes+ "eyes");
	}
}

class Dog{
		
}

public class ClassIntroduction {

	public static void main(String[] args) {
		Cat muzzy = new Cat(); 
		Cat tuzzy = new Cat();
		
		muzzy.legs = 4;
		muzzy.eyes = 2;
		
		muzzy.description();
		muzzy.walk();
		muzzy.eat();
	}

}
