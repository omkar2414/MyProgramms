package practice;

public class Student extends Teacher {
	
	public Student(String name) {
		super(name);
	}
	public void want() {
		super.want();
		System.out.println(name+" "+"dont want reservation");
	}

public static void main(String[] args) {
	
	
	}
}

