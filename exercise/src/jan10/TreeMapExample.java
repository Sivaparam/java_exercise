package jan10;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(3, "A");
		treemap.put(2, "B");
		treemap.put(1, "C");
		
		//map is printed in different pattern than the order it was inserted.
		//As the key is integer, it sorted the key in natural order of key and printed data
		System.out.println(treemap);
		
		
		
	}

}
