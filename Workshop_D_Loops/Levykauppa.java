package Workshop_D_Loops;
import java.util.Scanner;

public class Levykauppa {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		double rahaa;
		double levynHinta = 20;

		System.out.print("Paljonko rahaa lompakossa on? ");
		rahaa = lukija.nextDouble();

		while (rahaa >= levynHinta) {

			System.out.println("Ostan levyn. Hinta " + levynHinta + " euroa.");
			rahaa -= levynHinta;
			System.out.println("Rahaa jäljellä lompakossa " + rahaa + " euroa");
		}
		
		System.out.println("Rahaa jäljellä " + rahaa + " euroa. Ei riitä levyn ostamiseen.");
		
		lukija.close();
	}
}