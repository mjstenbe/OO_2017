package Workshop_C_Reading;

import java.util.Scanner;

public class ValikonTulostaminen {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		int valinta;
		System.out.println("***************************");
		System.out.println("* 1 – Käynnistä auto");
		System.out.println("* 2 – Aja autoa");
		System.out.println("* 3 – Sammuta auto");
		System.out.println("* 4 – Lopeta peli");
		System.out.println("***************************");
		valinta = lukija.nextInt();
		switch (valinta) {
		case 1:
			System.out.println("Paina käynnistysnappia.");
			break;
		case 2:
			System.out.println("Varovaisesti siellä liikenteessä.");
			break;
		case 3:
			System.out.println("Paina sammutusnappia.");
			break;
		case 4:
			System.out.println("Avaa ovi ja poistu autosta.");
			break;
		default:
			System.out.println("Olet autossa.");
		}
	}
}
