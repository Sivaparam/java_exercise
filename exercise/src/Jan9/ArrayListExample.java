package Jan9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public void ArrayOps() {
		
		//List is interface that has Array list, linked list ) 
		List<Integer> arraylist = new ArrayList<>(3);
		
		//to add elements to arraylist use add()
		for (int i=1; i<=5; i++) {
			arraylist.add(i);
		}
		//anytime you print arraylist, it will always enclose data within square brackets
		System.out.println(arraylist);
	
	
		//to print arraylist without square brackets, arraylist has to be iterated
		for(int i: arraylist) {
			System.out.print(" " + i);
		}
		System.out.println();
		//to remove elements from arraylist, use remove(), it remove element at specified index
		arraylist.remove(2);
		
		System.out.println(arraylist);
		
		//to get an item from array list use get(), and to get size of arraylist use size()
		//this is traditional way
	
		for (int i=0; i<arraylist.size(); i++) {
			System.out.print(" " + arraylist.get(i));
		}
		
		//using enhanced for loop 
		System.out.println();
		System.out.println("Printing Arraylist using Enhanced for loop");
		for(int i: arraylist) {
			
			System.out.print(" " + i);
		}
		
		System.out.println();
		//to change the value of a arraylist at any index set()
		arraylist.set(1, 10);
		System.out.println(arraylist);
		
	}
	
	public static void main(String[] args) {
		ArrayListExample obj1 = new ArrayListExample();
		obj1.ArrayOps();
	}

}
