package Jan9;

public class Palindrome {
	
	//program to find if string is palindrome or not
	
	String s1;
	
	public Palindrome(String s1) {
		this.s1 = s1;
		
	}
	
	public void findPalindrome() {
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			s2 = c + s2;	
		}
		System.out.println(s1);
		System.out.println(s2);
		if (s1.equals(s2)) {
			System.out.println("Given String " + s1 + " is palindrome");
		} else {
			System.out.println("Given String " + s1 + " is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		Palindrome obj1 = new Palindrome("Ranjani");
		obj1.findPalindrome();
		Palindrome obj2 = new Palindrome("level");
		obj2.findPalindrome();
	}

}
