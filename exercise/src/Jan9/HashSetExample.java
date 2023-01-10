package Jan9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	public void setDemo() {
		
		//to initialize hashset 
		Set<String> hashset = new HashSet();
		
		//hashset add() method returns boolean value after adding element to set
		hashset.add("A");
		hashset.add("B");
		boolean b1 = hashset.add("C");
		System.out.println(b1);
		//retuns false as element c is already present in set 
		boolean b2 = hashset.add("C");
		System.out.println(b2);
		
		//hashset automatically removes duplicate values. 
		System.out.println(hashset);
		
		//contains() method checks if the hashset does contain element or not 
		
		boolean b3 = hashset.contains("A");
		System.out.println("Hashset contains element A " + b3);
		
		//remove() method removes element specified from hashset 
		hashset.remove("C");
		System.out.println(hashset);
		
		//fetch elements from hashset
		for(String i : hashset) {
			System.out.println(i);
		}
		
		//iterator is used to iterate over set 
		Iterator<String> itr = hashset.iterator();
		//prints the first item 
		System.out.println(itr.next());
		
	}
	
	public static void main(String[] args) {
		HashSetExample obj1 = new HashSetExample();
		obj1.setDemo();
		
	}

}
