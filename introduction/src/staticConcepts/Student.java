package staticConcepts;

import staticConcepts.Person.B;

public class Student {
	
	int age;
	String name;
	static String breed = "homo";

	public static void main(String[] args) {
		Person kia = new Person();
		Person.A seltos = kia.new A();
		
		B honda = new Person.B();
		
		

	}k

}
