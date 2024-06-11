package Lab_8;

class Vehicle {
	    private String brand;
	    private String model;
	    private int year;

	    public Vehicle(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    public void drive() {
	        System.out.println("Driving a " + brand + " " + model);
	    }
	}

	class Car extends Vehicle {
	    private String color;

	    public Car(String brand, String model, int year, String color) {
	        super(brand, model, year);
	        this.color = color;
	    }

	    public void honk() {
	        System.out.println("The " + color + " car is honking.");
	    }
	}

	public class VehicleDetails {
	    public static void main(String[] args) {
	        Car myCar = new Car("shiftdizer", "m340i", 2024, "white");
	        myCar.drive();
	        myCar.honk();
	    }
}