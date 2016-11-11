package Workshop_D_Loops;
import java.util.Scanner;

public class MerkkienLaskemista {

	public static void main(String[] args) {
		String lause, etsittava;
		int laskuri = 0;
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna syöte: ");
		lause = lukija.nextLine();
		
		System.out.println("Anna etsittävä: ");
		etsittava = lukija.nextLine();

		for (int i = 0; i < lause.length(); i++) {

			if (lause.charAt(i) == etsittava.charAt(0)) {
				laskuri++;
			}
		}
		System.out.println("Löydettiin: " + laskuri);
		lukija.close();
	}
}
