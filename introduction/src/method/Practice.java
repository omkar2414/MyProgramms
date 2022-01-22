package method;
class college {
	String name;
	String city;
	String type;
	
	
	college(String name ,String city ,String type ){
		this.name = name;
		this.city = city;
		this.type = type;
	}

public static void feedback() {
	System.out.println("One of the best college for engineering");

}
}
public class Practice {

	public static void main(String[] args) {

		college review = new college("VJTI", "Mumbai","Technical" );
		
		review.feedback();
		
		System.out.println(review.city);
		System.out.println(review.name);
		
	}

}
