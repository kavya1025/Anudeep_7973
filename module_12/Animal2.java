package package2;
import package1.Animal;

// Subclass inheriting Animal class
public class Dog extends Animal {
    // Additional instance variable specific to Dog
    private String sound;

    // Constructor for Dog class
    public Dog(String name, int age, double weight, String breed, String sound) {
        // Call to superclass constructor using super()
        super(name, age, weight, breed);
        this.sound = sound;
    }

    // Method to display dog details including sound
    public void displayDogDetails() {
        // Accessing protected and public variables of superclass
        System.out.println("Dog sound: " + sound);
        System.out.println("Dog breed (inherited): " + breed);
        System.out.println("Dog age (inherited and accessible due to protected): " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog("Buddy", 3, 15.5, "Labrador", "Bark");

        // Displaying dog details
        myDog.display();
        System.out.println(); // Empty line for separation
        myDog.displayDogDetails();
    }
}