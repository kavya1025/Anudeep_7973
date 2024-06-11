package Lab_4;
import java.util.Scanner;
public class WelcomeMsg {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = sc.next();
        sc.close();
        System.out.println("Welcome to Anudip, Mr. " + username );
    }
}
