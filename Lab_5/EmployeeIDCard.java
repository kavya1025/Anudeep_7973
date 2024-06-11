package Lab_5;

public class EmployeeIDCard {
	    // Static variables (class-level)
	    static int number = 112244; // To generate unique employee IDs
	    static String companyName = "Anudip Foundation"; // Company name

	    // Instance variables
	    int eid;
	    String ename;

	    // Constructor to initialize employee details
	    EmployeeIDCard(String ename) {
	        this.eid = number;
	        this.ename = ename;
	    }

	    // Static method to display employee details
	    static void displayEmployeeDetails(EmployeeIDCard emp) {
	        System.out.println("Employee ID: " + emp.eid);
	        System.out.println("Employee Name: " + emp.ename);
	        System.out.println("Company Name: " + companyName);
	  
	    }

	    public static void main(String[] args) {
	        // Create employee objects
	        EmployeeIDCard emp = new EmployeeIDCard("Max Mayfield");

	        // Display employee details
	        displayEmployeeDetails(emp);
	    }
	}

