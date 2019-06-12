
import java.util.Scanner;
public class Ch03_prj4_ChangeCalculator {

	public static void main(String[] args) {
		
		
		///Welcome
		System.out.println("Welcome to the Change Calculator");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {	

		//Prompt
		System.out.print("Enter number of cents (0-99): ");
		int cents = sc.nextInt();
		
		//Bus Logic
		int quarters = cents / 25;
		int total =  cents -  quarters * 25;
		int dimes =  total / 10;
		total =  total -  dimes * 10;
		int nickels =  total / 5;
		total =  total -  nickels * 5;
		int pennies =  total;
		
		
		//Display Results
		System.out.println("Quarters: " + quarters);		
		System.out.println("Dimes: " + dimes);	
		System.out.println("Nickels: " + nickels);	
		System.out.println("Pennies: " + pennies);	
		
		System.out.println("Continue? (y/n):");
		choice = sc.next();


//Bye
		System.out.println("Bye" );

													}
	}

}
