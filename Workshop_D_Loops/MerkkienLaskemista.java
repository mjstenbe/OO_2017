package Workshop_D_Loops;
import java.util.Scanner;

public class MerkkienLaskemista {

	public static void main(String[] args) {
		String lause, etsittava;
		int laskuri = 0;
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna sy�te: ");
		lause = lukija.nextLine();
		
		System.out.println("Anna etsitt�v�: ");
		etsittava = lukija.nextLine();

		for (int i = 0; i < lause.length(); i++) {

			if (lause.charAt(i) == etsittava.charAt(0)) {
				laskuri++;
			}
		}
		System.out.println("L�ydettiin: " + laskuri);
		lukija.close();
	}
}
