
import java.util.Scanner;

public class ForToisto {
	public static void main(String args[]) {
		int luku = 0;
		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna kokonaisluku: ");
		luku = lukija.nextInt();

		if (luku <= 0) {
			System.out.println("Et antanut positiivista kokonaislukua.");
		} else {
			for (int i = luku; i >= 0; i--) {
				System.out.println(i);
			}
		}
	}
}
