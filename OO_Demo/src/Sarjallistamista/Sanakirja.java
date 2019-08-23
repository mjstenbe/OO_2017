package Sarjallistamista;

import java.util.*;

public class Sanakirja {
	private static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {

		String[] suomi = { "kissa", "koira", "hevonen", "auto", "vene" };
		String[] englanti = { "cat", "dog", "horse", "car", "boat" };

		HashMap<String, String> sanakirja = new HashMap<String, String>();
		String sana1, sana2;

		for (int i = 0; i < suomi.length; i++) {

			sanakirja.put(suomi[i], englanti[i]);

		}

		do {
			System.out.print("Sana alkukielell�? (tyhj� lopettaa) ");
			sana1 = lukija.nextLine();
			if (sana1.equals(""))
				break;

			if (sanakirja.containsKey(sana1)) {
				System.out.println("Sana \"" + sana1 + "\" l�ytyy jo!");
				System.out.println("Vanha k��nn�s " + "\"" + sanakirja.get(sana1) + "\" j�� voimaan!");
				continue; // uusi alkukielinen sana
			}

			System.out.print("Sana k��nnettyn�?  (tyhj� lopettaa) ");
			sana2 = lukija.nextLine();
			if (sana2.equals(""))
				break; // sy�tt� loppui!

			// nyt molemmat sanat ovat ei-tyhji� ja ensimm�inen on uusi

			sanakirja.put(sana1, sana2);

		} while (true); // loppuu jomman kumman sanan ollessa ""

		System.out.println(sanakirja);

		do {
			System.out.print("Mink� sanan k��nn�ksen haluat tiet��? " + "(tyhj� sana lopettaa) ");
			sana1 = lukija.nextLine();
			if (sana1.equals(""))
				break; // kysely loppui!

			if (!sanakirja.containsKey(sana1))
				System.out.println("Sanan \"" + sana1 + "\" k��nn�s on tuntematon!");
			else
				System.out.println("Sanan \"" + sana1 + "\" k��nn�s on \"" + sanakirja.get(sana1) + "\"");

		} while (true); // loppuu tyhj��n sanaan
	}
}