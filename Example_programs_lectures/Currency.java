package Example_programs_lectures;

import java.util.Scanner;

/*
 * Simple currency converter "Euros to Dolars". The program does not perform input validation
 * or error handling. The user needs to use a "." (dot) as the decimal point, otherwise the
 * program will crash
 */
public class Currency {

	public static void main(String[] args) {
		System.out.println("********************");
		System.out.println("*Currency converter*");
		System.out.println("********************");
		
		double exchangeRate, amountEuro, amountDolar;
		Scanner inputReader = new Scanner(System.in);

		System.out.print("Enter the exchange rate Euro --> Dolar:");
		exchangeRate = inputReader.nextDouble();

		System.out.print("Enter the amount in Euros: ");
		amountEuro = inputReader.nextFloat();

		amountDolar = (amountEuro*exchangeRate);
		
		System.out.printf("The amount in Dolars is: %.2f", amountDolar);
		
		inputReader.close();
	}

}
