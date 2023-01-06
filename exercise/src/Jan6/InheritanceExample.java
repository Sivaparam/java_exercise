package Jan6;

public class InheritanceExample {

	public static void main(String[] args) {

		FruitColor obj1 = new FruitColor();
		obj1.name = "lemon";
		obj1.color = "yellow";
		obj1.DisplayName();
		obj1.DisplayColor();

	}

}

class FruitName {
	String name;

	public void DisplayName() {
		System.out.println("The Name of Fruit is " + name);
	}

}

class FruitColor extends FruitName {
	String color;

	public void DisplayColor() {
		System.out.println("Color of Fruit is " + color);
	}

}
