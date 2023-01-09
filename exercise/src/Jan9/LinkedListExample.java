package Jan9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public void LinkedOps() {
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//adds a element to linked list
		linkedlist.add("A");
		System.out.println(linkedlist);
		
		//add a element to list
		linkedlist.add("B");
		System.out.println(linkedlist);
		
		//adds a element to first position of the list 
		linkedlist.addFirst("D");
		System.out.println(linkedlist);
		
		//adds a element to last position of the list
		linkedlist.addLast("F");
		System.out.println(linkedlist);
		
		//adds a element at 2nd position (not index it is position) of linked list
		linkedlist.add(2, "C");
		System.out.println(linkedlist);
		
		//removes a element from list - just specify value 
		linkedlist.remove("F");
		System.out.println(linkedlist);
		
		//removes a element from list based on index position 
		linkedlist.remove(2);
		System.out.println(linkedlist);
		
		//removes a element from first position
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		
		//removes a element from last position
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		
		
	}
	
	public static void main(String[] args) {
		LinkedListExample obj1 = new LinkedListExample();
		obj1.LinkedOps();
		
	}

}
