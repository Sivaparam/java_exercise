package Jan9;

public class DuplicateChar {
	
	//duplicate chars in string 

	public void duplicate(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			for (int j = i+1; j < s1.length(); j++) {
				char c2 = s1.charAt(j);
				if (c1 == c2) {
					System.out.println(c2 + " is duplicate");
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateChar obj1 = new DuplicateChar();
		obj1.duplicate("ranjani");
	}

}
