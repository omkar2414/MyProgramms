package method;

public class PassByValueNonPremitive {
	
	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.legs = 24;
		Dog b = new Dog();
		b.legs = 14;
		
		swap(a,b);
		System.out.println( a.legs+"  "+b.legs);
	
		}	
	
static void swap(Dog c, Dog d) {
	Dog temp = c;
	c = d;
	d = temp;
	

}
}
class Dog {
	int legs;
}

