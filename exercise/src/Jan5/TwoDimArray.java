package Jan5;

public class TwoDimArray {
	
	//print matrix using 2 dimensional array

		public static void main(String[] args) {

			TwoDimArray obj1 = new TwoDimArray();

			int[][] arr1 = new int[][] {{ 1, 2, 3, 4, 5 }, {6, 7, 8, 9, 10}};

			obj1.PrintTwoDim(arr1);

		}

		public void PrintTwoDim(int[][] arr) {

			for (int i = 0; i < arr.length; i++) {
				for(int j=0; j< arr[i].length; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.println();
			}

		}

	}

	
