package Workshop_D_Loops;
import java.util.Scanner;

public class Vaarinpain {

	public static void main(String[] args) {

		String sy�te;
		int pituus;
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna sy�te: ");
		sy�te = lukija.nextLine();

		pituus = sy�te.length();

		System.out.println("V��rinp�in:");

		for (int i = pituus - 1; i >= 0; i--) {
			System.out.print(sy�te.charAt(i));
		}

		lukija.close();
	}
}
