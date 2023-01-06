package Jan5;

public class ArrayExample {

	public static void main(String[] args) {

		ArrayExample obj1 = new ArrayExample();

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

		obj1.PrintArray(arr1);

	}

	public void PrintArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element in index " + i + " is " + arr[i]);
		}

	}

}
