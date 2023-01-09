package Jan9;

public class StringCharPos {
	
	//program to find position of char in a given string

	public void Charpos(String s1, char c1) {
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == c1) {
				System.out.println("Position of given char is " + (i + 1));
			}
		}
	}

	public static void main(String[] args) {
		StringCharPos obj1 = new StringCharPos();
		obj1.Charpos("ranjani", 'j');
	}

}
