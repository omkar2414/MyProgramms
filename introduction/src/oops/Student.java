package oops;

public class Student {
	public String name;
	public int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 20) {
			System.out.println("youre to old");
		}else {
			this.age = age;
		}
		
	}

	public Student(String name) {
		this.name = name;
		}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}

	public static void main(String[] args) {
		
		
	}

}
