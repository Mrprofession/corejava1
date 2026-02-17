package Constructor;

public class Car {
	String make; 
	String model;
	int year;

	Car(String m, String o, int y) {
		make = m;
		model = o;
		year = y;

	}

	void displayDetails() {
		System.out.println("Make : " + make ); 
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
	}

	public static void main(String[] args) {
		Car c1 = new Car("BMW", "S5", 2022);
		c1.displayDetails();

		Car c2 = new Car("Audi", "Q3", 2017);
		c2.displayDetails();

		Car c3 = new Car("Mercedes benz", "c class", 2024);
		c3.displayDetails();

	}

}
