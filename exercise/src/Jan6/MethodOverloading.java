package Jan6;

public class MethodOverloading {
	
	//Method sum is defined with different data type arguments 
	
	public static void main(String[] args) {
		MethodOverloading obj1 = new MethodOverloading();
		int result = obj1.sum(5, 10);
		System.out.println("Sum of 2 Integers " + result);
		float result1 = obj1.sum(1.5f, 2.5f);
		System.out.println("Sum of Float " + result1);
		result = obj1.sum(5, 10, 15);
		System.out.println("Sum of 3 Integers " + result);
		
	}
	
	//Sum method with integer argument
	public int sum(int a, int b) {
		return a+b;
		
	}
	
	//sum method with float argument
	public float sum(float a, float b) {
		return a+b;
		
	}
	
	//sum method with 3 parameter
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

}
