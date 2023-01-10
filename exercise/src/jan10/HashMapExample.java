package jan10;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		
		//key value pair hash map
		HashMap<String, String> capitalCities = new HashMap<>(5);
		
		//to insert data in hash map
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		//data will be enclosed in curly brackets
		System.out.println(capitalCities);
		
		//size of map()
		System.out.println("Size of map is: " + capitalCities.size());
		
		//contains() method - to check if a particular key is present in map
		System.out.println();
		System.out.println("containsKey");
		if(capitalCities.containsKey("USA")) {
			String capital = capitalCities.get("USA");
			
		}
		
		//to fetch all keys in set representation
		System.out.println();
		System.out.println("keySet");
		for(String Key: capitalCities.keySet()) {
			System.out.println("Key: " +Key+", Value" + capitalCities.get(Key));
		}
		
		//to fetch key value , each entry is of type Entry class
		System.out.println();
		System.out.println("Entry class for key and value ");
		for(Entry<String, String> entry: capitalCities.entrySet()) {
			System.out.println("Key " + entry.getKey() + ", value" + entry.getValue());
		}
		
		
	}
}
