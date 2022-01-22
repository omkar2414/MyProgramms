package peopke;

public class Teacher extends Admin {
	

	public Teacher(String name, int rollnumber) {
		super(name, rollnumber);
		
	}

	public static void main(String[] args) {
		
		Admin obj = new Admin("Omkar", 98);
		getAdmission();

	}

}
