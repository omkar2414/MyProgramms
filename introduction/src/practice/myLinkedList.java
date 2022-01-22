package practice;

import practice.Practice.Node;

public class myLinkedList {

	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		
		if(head == null) {
			head = toAdd;
			return;
		}
//		null pointer exception
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		 	temp.next = toAdd;
	}
		void print() {
			
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
				
			}
		}
		void get(int index) {
			int count = 0 ;
			
			Node temp = head;
			while(temp != null) {
			
				if(index == count) {
					
					System.out.println(temp.data);
					break;
				}
					count++;
					temp = temp.next;
			}
		}
		
		void set(int index, int value) {
			Node toAdd = new Node (value);
				
				int count = 0 ;
				Node tt = null;
				Node temp = head;
				while(temp.next!= null) {
					
					if(count == index-1) {
						tt = temp.next;
						temp.next = toAdd;
						toAdd.next = tt;
						}
						count++;
						temp = temp.next;
					}
				
				}
		
		void size() {
			Node temp = head;
			int count=0;
			int aa =0;
			while(temp != null) {
				count += 1;
				temp = temp.next;
			}
			aa = count-1;
			System.out.print(aa);
		}
		
			

	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
}	


