package Workshop_C_Reading;

import java.util.Scanner;

public class Valuuttamuunnin {

public static void main(String[] args) {
	System.out.println("***************");
	System.out.println("*Valuuttamuunnin*");
	System.out.println("***************");
	
	double dkurssi, maara;
	Scanner lukija = new Scanner(System.in);

	System.out.print("Anna dollarin kurssi euroina:");
	dkurssi = lukija.nextDouble();

	System.out.print("Anna rahan m‰‰r‰ euroina: ");
	maara = lukija.nextDouble();

	double arvod;
	arvod = (maara/dkurssi);
	System.out.format("Rahan arvo on dollareina: %.2f", arvod);
	
	lukija.close();
}
}
