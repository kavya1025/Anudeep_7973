package Lab_9;
import java.util.Scanner;
class Geometry {
	 public double calculateArea(double length, double width) {
	        return length * width;
	    }

	    public double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    public double calculateVolume(double length, double width, double height) {
	        return length * width * height;
	    }
	}

public class GeometryCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geometry geometry = new Geometry();

        System.out.println("Geometry Calculator:\n");
        System.out.println("1. Calculate area of a rectangle");
        System.out.println("2. Calculate area of a circle");
        System.out.println("3. Calculate volume of a box");
        System.out.println("4. Exit");

        System.out.print("\nEnter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of rectangle: ");
                double rectLength = scanner.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double rectWidth = scanner.nextDouble();
                double rectArea = geometry.calculateArea(rectLength, rectWidth);
                System.out.println("Area of rectangle: " + rectArea);
                break;

            case 2:
                System.out.print("Enter radius of circle: ");
                double circleRadius = scanner.nextDouble();
                double circleArea = geometry.calculateArea(circleRadius);
                System.out.println("Area of circle: " + circleArea);
                break;

            case 3:
                System.out.print("Enter length of box: ");
                double boxLength = scanner.nextDouble();
                System.out.print("Enter breadth of box: ");
                double boxWidth = scanner.nextDouble();
                System.out.print("Enter height of box: ");
                double boxHeight = scanner.nextDouble();
                double boxVolume = geometry.calculateVolume(boxLength, boxWidth, boxHeight);
                System.out.println("Volume of box: " + boxVolume);
                break;

            case 4:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please select correct choice.");
        }

        scanner.close();
    }
}