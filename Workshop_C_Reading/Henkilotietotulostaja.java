package Workshop_C_Reading;

import java.util.Scanner;

public class Henkilotietotulostaja {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		// Reading input from the user

		System.out.println("SYÖTÄ HENKILÖTIEDOT:");
		System.out.println("--------------------\n");

		System.out.println("Anna etunimet:");
		String etunimet = lukija.nextLine();

		System.out.println("Anna sukunimi:");
		String sukunimi = lukija.nextLine();

		System.out.println("Anna puhelin:");
		String puhelin = lukija.nextLine();
		
		System.out.println("Anna sähköpostiosoite:");
		String email = lukija.nextLine();
				
		System.out.println("Anna syntymävuosi:");
		int svuosi = lukija.nextInt();
		
		lukija.close(); // Closing the "lukija" object so that Eclipse does not a warning about a scanner not being closed 
		
		// Printing the results
		System.out.println("\nKIITOS!\n\n");
		System.out.println("HENKILÖTIETOSI: ");
		System.out.println("--------------------\n");
		System.out.println("NIMI: ");
		System.out.println("\t" + sukunimi + ", " + etunimet);
		System.out.println("PUH: ");
		System.out.println("\t" + puhelin);
		System.out.println("E-MAIL: ");
		System.out.println("\t" + email);
		System.out.println("IKÄ: ");
		System.out.println("\t" + (2017 - svuosi));
	}
}
