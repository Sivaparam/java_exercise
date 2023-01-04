package Jan4;

public class BranchingStatement {
	public static void main(String[] args) {
		// break statement
		for (int i = 0; i < 5; i++) {
			System.out.println("value of i " + i);
			if (i == 2) {
				System.out.println("Value of I reached " + i + " breaks loop and comes out of for loop");
				break;
			}
		}

		// break statement with 2 for statement
		//inner for loop break when it reaches 2, however, it keeps executing the inner loop for number of times of outer loop
		for (int a = 0; a < 5; a++) {

			for (int b = 0; b < 5; b++) {
				System.out.println("value of b " + b);
				if (b == 2) {
					break;
				}
			}
			System.out.println("value of a " + a);
			if (a==3) {
				break;
			}
		}

		// continue statement
		for (int j = 10; j < 15; j++) {

			if (j == 12) {
				System.out.println("Value of j reached " + j
						+ " continue loop skipping condition/iteration and continues next iteration");
				continue;
			}
			System.out.println("value of j " + j);
		}
	}

}
