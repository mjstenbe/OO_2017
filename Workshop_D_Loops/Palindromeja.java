package Workshop_D_Loops;
import java.util.Scanner;

public class Palindromeja {

	public static void main(String[] args) {

		String syöte, väärinpäin;
		int pituus;
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna syöte: ");
		syöte = lukija.nextLine();
		
		// Poistetaan välilyönnit
		syöte = syöte.replaceAll(" ", "");
		pituus = syöte.length();

		väärinpäin = "";
		
		for (int i = pituus-1; i >= 0; i--) {
			väärinpäin += syöte.charAt(i);
		}
		
		if ( syöte.equalsIgnoreCase(väärinpäin) ){
			System.out.println("Kyseessä on palindromi.");
		}
		else {
			System.out.println("Ei ollut.");
		}
		
		lukija.close();
	}
}
