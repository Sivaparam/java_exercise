package Jan4;

public class Factorials {

	//program to find factorial of any number
	public static void main(String[] args) {
		
		Factorials obj1 = new Factorials();
		obj1.FactorialNum(3);	
		obj1.FactorialNum(5);	
		obj1.FactorialNum(8);

	}
	
	public void FactorialNum(int a) {
		int factorial = 1;
		for (int i=a; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + a +" : " + factorial);
	}

}
