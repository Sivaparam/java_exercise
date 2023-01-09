package Jan9;

public class ReverseString {
	
	//program to find reverse of string 

	public void reverse(String s1) {

		// using charAt() and assigning to another string variable
		String s2 = "";
		for (int j = 0; j < s1.length(); j++) {
			char c1 = s1.charAt(j);
			s2 = c1 + s2;
		}

		// using decrement method and charAt()
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			System.out.print(c);

		}
		System.out.println();
		System.out.println(s2);
	}

	public static void main(String[] args) {
		ReverseString obj1 = new ReverseString();
		obj1.reverse("Selenium");

	}

}
