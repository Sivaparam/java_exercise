package Jan4;

public class SumOfNum {
	
	//program to calculate sum of first 10 natural numbers

	public static void main(String[] args) {
		
		// Sum of random 10 given numbers
		SumOfNum obj1 = new SumOfNum();
		obj1.RandomSum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		obj1.RandomSum(5, 15, 25, 35, 45, 55, 65, 75, 85, 95);
		
		
		//Sum of consecutive 10 numbers
		SumOfNum obj2 = new SumOfNum();
		obj2.ConsecutiveSum(1, 10);
		obj2.ConsecutiveSum(11, 20);
		obj2.ConsecutiveSum(21, 30);

	}
	
	//method to print sum of random 10 numbers
	public void RandomSum(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10)
	{
		int sumNum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
		System.out.println("Sum of given Random numbers: " + sumNum);
	}
	
	//method of print sum of consecutive 10 numbers
	public void ConsecutiveSum(int start, int stop) {
		int result = 0;
		for (int i=start; i<=stop; i++) {
			result = result + i;
		}
		System.out.println("Sum of consecutive numbers " + start + " , " + stop + " : " + result);
		
	}

}
