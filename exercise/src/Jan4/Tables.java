package Jan4;

public class Tables {
	
	//program to print table of given number
	public static void main(String[] args) {
		Tables obj1 = new Tables();
		obj1.PrintTables(2);
		obj1.PrintTables(5);
		obj1.PrintTables(10);
		
	}
	
	public void PrintTables(int a) {
		System.out.println("Print tables of " + a);
		for(int i=1; i<=10; i++) {
			int result = a * i;
			System.out.println(a + " * " + i + " = " + result);
		}
	}

}
