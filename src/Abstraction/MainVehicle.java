package Abstraction;

public class MainVehicle {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle boat = new Boat();

        car.move();
        boat.move();
    }
}