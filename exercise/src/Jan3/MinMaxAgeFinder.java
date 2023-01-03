package Jan3;

public class MinMaxAgeFinder {
	public static void main(String[] args) {
		MinMaxAgeFinder obj1 = new MinMaxAgeFinder();
		obj1.maxAge(11, 22, 31);
		obj1.maxAge(34, 48, 23);
		obj1.maxAge(50, 40, 30);
		obj1.minAge(11, 22, 31);
		obj1.minAge(34, 48, 23);
		obj1.minAge(50, 40, 30);
	}

	public void maxAge(int age1, int age2, int age3) {
		if (age1 > age2 && age1 > age3) {
			System.out.println(age1 + " is oldest age");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println(age2 + " is oldest age");
		} else {
			System.out.println(age3 + " is oldest age");
		}
	}

	public void minAge(int age1, int age2, int age3) {
		if (age1 < age2 && age1 < age3) {
			System.out.println(age1 + " is youngest age");
		} else if (age2 < age1 && age2 < age3) {
			System.out.println(age2 + " is youngest age");
		} else {
			System.out.println(age3 + " is youngest age");
		}
	}

}
