package Jan3;

public class RectangularFinder {
	public static void main(String[] args) {
		RectangularFinder obj1 = new RectangularFinder();
		obj1.isSquare(5.0f, 4.0f);
		obj1.isSquare(5.0f, 5.0f);
		obj1.isSquare(5.5f, 4.0f);
		obj1.isSquare(4.5f, 4.5f);
	}

	public void isSquare(float length, float breadth) {
		if (length == breadth) {
			System.out.println(length + "," + breadth + "is a Square");
		} else {
			System.out.println(length + "," + breadth + "is a Rectangle");
		}
	}

}
