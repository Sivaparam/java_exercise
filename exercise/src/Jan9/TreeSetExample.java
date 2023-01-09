package Jan9;

import java.util.TreeSet;

public class TreeSetExample {
	
	public void treeSet() {
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		//add element to treeset 
		treeset.add("B");
		treeset.add("A");
		treeset.add("C");
		treeset.add("C");
		
		//treeset eliminates duplicates, and adds elements in ascending /natrual sorting based on datatype
		System.out.println(treeset);
		
		
	}
	
	public static void main(String[] args) {
		TreeSetExample obj1 = new TreeSetExample();
		obj1.treeSet();

	}

}
