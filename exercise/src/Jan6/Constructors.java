package Jan6;

public class Constructors {
	
	String name;
	int age;
	
	// constructor which invokes a method
	public Constructors(String name, int age) {
		
		this.name  =name;
		this.age = age;
		print();
	

	}
	
	public void print() {
		System.out.println("Name " + name + " Age " + age);
	}

	public static void main(String[] args) {

		// as soon as an obj is created, statement under constructor gets executed
		Constructors Obj1 = new Constructors("Ranjani", 25);
		Constructors Obj2 = new Constructors("Parames", 30);

	}

}
