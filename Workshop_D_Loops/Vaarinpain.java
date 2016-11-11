package Workshop_D_Loops;
import java.util.Scanner;

public class Vaarinpain {

	public static void main(String[] args) {

		String syöte;
		int pituus;
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna syöte: ");
		syöte = lukija.nextLine();

		pituus = syöte.length();

		System.out.println("Väärinpäin:");

		for (int i = pituus - 1; i >= 0; i--) {
			System.out.print(syöte.charAt(i));
		}

		lukija.close();
	}
}
