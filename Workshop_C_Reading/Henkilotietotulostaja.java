package Workshop_C_Reading;

import java.util.Scanner;

public class Henkilotietotulostaja {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		// Luetaan tiedot

		System.out.println("Sy�t� henkil�tiedot:");
		System.out.println("--------------------");

		System.out.println("Anna etunimet:");
		String etunimet = lukija.nextLine();

		System.out.println("Anna sukunimi:");
		String sukunimi = lukija.nextLine();

		System.out.println("Anna puhelin:");
		String puhelin = lukija.nextLine();
		
		System.out.println("Anna email osoite:");
		String email = lukija.nextLine();
		
		// Just to get started
		/*
		if (email.indexOf("@")==0)
		{
				System.out.println("Virhellinen email osoite.");
				System.out.println("Anna email osoite:");
				email = luka.nextLine();
		}
		*/
		
		// Better solution
		while (email.indexOf("@")<0 || email.indexOf(".")<0)
		{
				System.out.println("Virhellinen email osoite.");
				System.out.println("Anna email osoite:");
				email = lukija.nextLine();
		}
		
		System.out.println("Anna syntym�vuosi:");
		int svuosi = lukija.nextInt();

		// Tulostetaan tiedot

		System.out.println("Henkil�tietosi: ");

		System.out.println("Kiitos! \n");
		System.out.println("Henkil�n tiedot");
		System.out.println("--------------------");

		System.out.println("Nimi: ");
		System.out.println("\t" + sukunimi + ", " + etunimet);
		System.out.println("Puh: ");
		System.out.println("\t" + puhelin);
		System.out.println("Ik�: ");
		System.out.println("\t" + (2013 - svuosi));

	}

}
