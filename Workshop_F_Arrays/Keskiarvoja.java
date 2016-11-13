package Workshop_F_Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Keskiarvoja {

	public static void main(String[] args){
		
		Scanner lukija = new Scanner(System.in);
		int [] arvosanat = new int[5];
		
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Sy�t� arvosana: ");
			arvosanat[i] = lukija.nextInt();
		}
		// Tulostetaan taulukko
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Indeksi: "+i);
			System.out.println(" Arvosana: "+arvosanat[i]);
		}
		
		// J�rjestet��n taulukko
		
		Arrays.sort(arvosanat);
		
		// Tulostetaan
		
		// Tulostetaan taulukko
		
		System.out.println("Taulukko j�rjestettyn�: ");
		
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Indeksi: "+i);
			System.out.println(" Arvosana: "+arvosanat[i]);
		}

		
		System.out.println("Taulukon keskiarvo: ");
		
		double keskiarvo = 0; 
		
		for (int i=0; i < arvosanat.length; i++){
			keskiarvo += arvosanat[i]; 
			// Saman voisi tehd� my�s n�in
			//keskiarvo = keskiarvo + arvosanat[i];
		}
		
		System.out.println("Alkiot yhteens�: "+keskiarvo);
		System.out.println("Keskiarvo: "+keskiarvo / arvosanat.length);
		
		
	}
	
}
