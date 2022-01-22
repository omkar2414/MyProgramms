package practice;

public class MainClass {
	
	public static void getWashed(Car car) {
		System.out.println("car is washed");
	}
	
public static void main(String[] args) {
	
	BMW BMW = new BMW();
	Mercedez Mercedez = new Mercedez();
	
	getWashed(BMW);
	getWashed(Mercedez);
	
}
}
	
	
