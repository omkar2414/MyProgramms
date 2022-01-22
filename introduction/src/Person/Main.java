package Person;

public class Main extends Man {

	public static void main(String[] args) {

		Teacher t = new Teacher();
		t.name = "Mr. Omkar";
		t.eat();
		t.walk();
		
		Singer s = new Singer();
		s.name = "Mr. Raju";
		s.sing();
		s.eat();
		s.walk();
		

	}

}
