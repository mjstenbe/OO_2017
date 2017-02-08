package Example_programs_lectures;

import java.util.Scanner;

public class Henkilotietotulostaja {
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		// Reading input from the user
		System.out.println("Syötä henkilötiedot:");
		System.out.println("--------------------");

		System.out.println("Anna etunimet:");
		String etunimet = lukija.nextLine();

		System.out.println("Anna sukunimi:");
		String sukunimi = lukija.nextLine();

		/* 
		After this point you should add the code to read the remaining inputs (puhelin, sähköpostiosoite, syntymävuosi)
		Use a different variable for each input. Note, that for syntymävuosi you will need to read the input as an integer 
		as later you will need to do an arithmetic operation with it to find out the person's age
		*/

		// CODE TO READ THE REMAINING INPUT HERE ...
		
		
		// Printing the results. At this point you have read all the input from the user
		// Let's start printing the results
		System.out.println("\nKIITOS!\n\n");
		System.out.println("HENKILÖTIETOSI: ");
		System.out.println("--------------------\n");
		System.out.println("NIMI: ");
		System.out.println("\t" + sukunimi + ", " + etunimet);
		
		// CODE TO PRINT THE REMAINING OUPUTS HERE ...
			
	}
}
