package Jan3;

public class GreatestNum {
	public static void main(String[] args) {
		GreatestNum obj1 = new GreatestNum();
		obj1.findGreatest(5, 6);
		obj1.findGreatest(9, 5);
		obj1.findGreatest(7, 7);
	}

	public void findGreatest(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("Greatest Number of " + "(" + num1 + "," + num2 + ") :" + num1);
		} else if (num2 > num1) {
			System.out.println("Greatest Number of " + "(" + num1 + "," + num2 + ") :" + num2);
		} else {
			System.out.println("Numbers are equal " + num1 + "," + num2);
		}
	}

}
