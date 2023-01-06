package Jan6;

public class MethodOverriding {
	public static void main(String[] args) {
		//MethodOverriding obj1 = new MethodOverriding();
		
	Arithmetic obj1 = new Arithmetic();
	obj1.ArithmeticOps(1, 1);
	
	Arithmetic obj2 = new sum();
	obj2.ArithmeticOps(5, 6);
	
	Arithmetic obj3 = new subtract();
	obj3.ArithmeticOps(7, 6);
	
	Arithmetic obj4 = new multiply();
	obj4.ArithmeticOps(6, 7);
	
	Arithmetic obj5 = new divide();
	obj5.ArithmeticOps(7, 6);
	

	}
}

	class Arithmetic {
		public void ArithmeticOps(int a, int b) {
			
			System.out.println("Arithmetic operations");	
		}
	}

	class sum extends Arithmetic {
		public void ArithmeticOps(int a, int b) {
			
			int result = a+b;
			System.out.println("Addition " + result);
		}
	}

	class subtract extends Arithmetic {
		public void ArithmeticOps(int a, int b) {
			
			int result = a-b;
			System.out.println("Substraction " + result);
		}
	}
	
	class multiply extends Arithmetic {
		public void ArithmeticOps(int a, int b) {
			
			int result = a*b;
			System.out.println("Multiplication " + result);
		}
	}
	
	class divide extends Arithmetic {
		public void ArithmeticOps(int a, int b) {
			
			int result = a/b;
			System.out.println("Division " + result);
		}
	}

