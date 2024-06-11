package Lab_8;

class Person {
	 protected String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void speak() {
	        System.out.println("My name is " + name + ".\nI am " + age + " years old.");
	    }
	}

	class Student extends Person {
	    private int grade;

	    public Student(String name, int age, int grade) {
	        super(name, age);
	        this.grade = grade;
	    }

	    public void study() {
			System.out.println(name + " studies to score grade " + grade + ".");
	    }
	}

	public class PersonDetails {
	    public static void main(String[] args) {
	        Student student1 = new Student("kavya", 21, 1);
	        student1.speak();
	        student1.study();
	    }
}
	   