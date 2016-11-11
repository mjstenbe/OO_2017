package Workshop_C_Reading;

import java.util.Scanner;

public class Karkausvuosi {
	public static void main(String args[]) {

		Scanner lukija = new Scanner(System.in);

		int rajavuosi = 1753;
		int vuosi;

		System.out.print("Mikä vuosi on nytten? ");
		vuosi = lukija.nextInt();
		if (vuosi < rajavuosi) {
			System.out.print("Karkausvuosi tuli käyttöön vasta vuonna 1753.");
		}

		else if (vuosi % 400 == 0 || (vuosi % 4 == 0 && vuosi % 100 != 0)) {
			System.out.println("Vuosi oli/on karkausvuosi.");
		} else {
			System.out.println("Vuosi ei ollut/ole karkausvuosi.");

		}

	}
}