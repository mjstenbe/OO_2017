import java.util.Scanner;

public class Lasku {
	private static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		int luku1 = Integer.parseInt(lukija.nextLine());
		int luku2 = Integer.parseInt(lukija.nextLine());
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna ensimmäinen luku: ");
		luku1 = lukija.nextInt();
		System.out.print("Anna toinen luku: ");
		luku2 = lukija.nextInt();
		system.out.println("Antamiesi lukujen summa on " + (luku1 + luku2));
	}
}