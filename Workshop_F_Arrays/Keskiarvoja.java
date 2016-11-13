package Workshop_F_Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Keskiarvoja {

	public static void main(String[] args){
		
		Scanner lukija = new Scanner(System.in);
		int [] arvosanat = new int[5];
		
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Syötä arvosana: ");
			arvosanat[i] = lukija.nextInt();
		}
		// Tulostetaan taulukko
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Indeksi: "+i);
			System.out.println(" Arvosana: "+arvosanat[i]);
		}
		
		// Järjestetään taulukko
		
		Arrays.sort(arvosanat);
		
		// Tulostetaan
		
		// Tulostetaan taulukko
		
		System.out.println("Taulukko järjestettynä: ");
		
		for (int i=0; i < arvosanat.length; i++){
			System.out.print("Indeksi: "+i);
			System.out.println(" Arvosana: "+arvosanat[i]);
		}

		
		System.out.println("Taulukon keskiarvo: ");
		
		double keskiarvo = 0; 
		
		for (int i=0; i < arvosanat.length; i++){
			keskiarvo += arvosanat[i]; 
			// Saman voisi tehdä myös näin
			//keskiarvo = keskiarvo + arvosanat[i];
		}
		
		System.out.println("Alkiot yhteensä: "+keskiarvo);
		System.out.println("Keskiarvo: "+keskiarvo / arvosanat.length);
		
		
	}
	
}
