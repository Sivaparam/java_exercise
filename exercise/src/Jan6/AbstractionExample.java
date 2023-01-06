package Jan6;

public class AbstractionExample {

	public static void main(String[] args) {
		Car EC1 = new ElectricCar("Tesla", "Y");
		EC1.CarName();
		EC1.start();

		Car FC1 = new FuelCar("Audi", "R8");
		FC1.CarName();
		FC1.start();
	}

	abstract static class Car {
		public abstract void start();

		protected String make;
		public String model;

		public void CarName() {
			System.out.println(make);
			System.out.println(model);
		}
	}

	static class ElectricCar extends Car {
		/*
		 * public String make = "tesla"; public String model = "XSeries";
		 */

		public ElectricCar(String make, String model) {
			this.make = make;
			this.model = model;
		}

		public void start() {
			SupplyPower();
		}

		public void SupplyPower() {
			System.out.println("Power Supply is ON, starting engine");
		}
	}

	static class FuelCar extends Car {

		// constructor
		public FuelCar(String make, String model) {
			this.make = make;
			this.model = model;
		}

		public void start() {
			BurnFuel();
			SupplyPower();
		}

		public void BurnFuel() {
			System.out.println("Generating power");
		}

		public void SupplyPower() {
			System.out.println("Starting Engine");
		}
	}
}
