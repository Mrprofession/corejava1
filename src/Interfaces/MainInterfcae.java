package Interfaces;

public class MainInterfcae {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
				b1.start();
				b1.refuel(10);
				
				Car c1 = new Car();
				c1.start();
				c1.refuel(30);
	}

}
