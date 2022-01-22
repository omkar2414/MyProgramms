package oops;

class mf{
	int time;
	int amt;

	mf(int time){
		this.time = time;
		amt = 100;
	}
}

public class Constructors {
	
	public static void main(String[] args) {
		
		mf obj = new mf(1);
		System.out.println(obj.amt+" "+"rupees and time"+obj.time);
	}
	
}
