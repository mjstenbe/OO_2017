package Workshop_F_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Teht2 {
	public static void main(String[] args){		
		Scanner lukija = new Scanner(System.in);
		int [] arvosanat = new int[5];
		
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Sy�t� " + (i+1) + ". arvosana: ");
			arvosanat[i] = lukija.nextInt();
		}
		
		lukija.close();
		
		Arrays.sort(arvosanat);  // J�rjestet��n taulukko
		
		// Tulostetaan taulukko
		System.out.println("Arvosanat j�rjestyksess�: ");		
		for (int i=0; i < arvosanat.length; i++){
			System.out.print(arvosanat[i] + " ");
		}
		System.out.println();
		
		double keskiarvo = 0; 
		
		for (int i=0; i < arvosanat.length; i++){
			keskiarvo += arvosanat[i]; 
			// Saman voisi tehd� my�s n�in
			//keskiarvo = keskiarvo + arvosanat[i];
		}
		
		System.out.println("Keskiarvo: "+keskiarvo / arvosanat.length);		
	}
}
