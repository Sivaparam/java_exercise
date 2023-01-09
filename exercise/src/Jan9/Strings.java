package Jan9;

public class Strings {
	
	//string methods

	String s1;
	String s2;

	public Strings(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void compareString() {
		s1.equals(s2);
		System.out.println("Inside CompareString");
		System.out.println(s1.equals(s2));

	}

	public void concatString() {
		System.out.println();
		System.out.println("inside concatString");
		System.out.println(s1.concat(s2));

	}

	public void subStrings() {
		System.out.println();
		System.out.println("inside subString");
		System.out.println(s1.substring(0, 3));

	}

	public void StringLength() {
		System.out.println();
		System.out.println("inside stringlenght");
		System.out.println(s1.length());

	}

	public void StringCharAt() {
		System.out.println();
		System.out.println("inside StringChar");
		System.out.println(s1.charAt(3));

	}

	public void stringCase() {
		System.out.println();
		System.out.println("inside string case");
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

	}

	public void replaceString() {
		System.out.println();
		System.out.println("inside replace");
		System.out.println(s1.replace("R", "P"));

	}

	public static void main(String[] args) {

		Strings obj1 = new Strings("Ranjani", "Jaya");
		obj1.compareString();
		obj1.concatString();
		obj1.subStrings();
		obj1.StringLength();
		obj1.StringCharAt();
		obj1.stringCase();
		obj1.replaceString();

	}

}
