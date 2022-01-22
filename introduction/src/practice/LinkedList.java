package practice;


public class LinkedList {

	public static void main(String[] args) {
		
		myLinkedList obj = new myLinkedList();
		
		obj.add(12);
		obj.add(23);
		obj.add(4);
		obj.add(5);
		obj.add(55);
		obj.add(23);
		
		obj.set(5, 100);
		obj.set(3, 23);
		obj.set(1, 56);
		obj.print();		
		
		
		
	}
	

}
