package MethodOverriding;

public class VehicleMain {

	public static void main(String[] args) {
	ExampleVehicle v;
	v = new Car();
	v.speed();
	
	v = new Bike();
	v.speed();
	
	}

}
