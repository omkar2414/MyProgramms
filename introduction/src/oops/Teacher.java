package oops;
import oops.Student;

public class Teacher {

	public static void main(String[] args) {

		Student obj = new Student("Omkar");
		obj.getName();
		obj.name = "omkar";
		obj.setAge(3);
		System.out.println(obj.getAge());
		
	}

}
