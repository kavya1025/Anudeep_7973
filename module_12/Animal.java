package package1;

// Superclass
public class Animal {
    // Instance variables with different access specifiers
    private String name;
    protected int age;
    double weight; // Default access modifier
    public String breed;

    // Constructor
    public Animal(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    // Method to display animal details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Breed: " + breed);
    }
}