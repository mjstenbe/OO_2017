package Example_programs_lectures;

import java.util.Scanner;

/*
 * This is a simple program that demonstrates how the method indexOf can be used to validate an email address
 * A more complete validation logic is better implemented with the use of regular expressions. See for example:
 * https://www.tutorialspoint.com/javaexamples/regular_email.htm
 * During our course we will not look into regular expressions
 */
public class EmailChecking {

	public static void main(String[] args) {
		
		String emailAddress;
		Scanner inputReader = new Scanner(System.in);

		System.out.print("Enter an email address:");
		
		emailAddress = inputReader.nextLine();
		
		// Very simple and incomplete email validation logic
		if (emailAddress.indexOf('@') < 0 || emailAddress.indexOf('.') < 0)
		{
			System.out.print("Email has wrong format!");
		}
		else
		{
			System.out.print("Valid email!");
		}
		
		inputReader.close();
	}

}
