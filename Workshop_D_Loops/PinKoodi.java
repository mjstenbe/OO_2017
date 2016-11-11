package Workshop_D_Loops;
import java.util.Scanner;
public class PinKoodi {
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		int pin;

		do {
			System.out.println("Anna PIN: ");
			pin = lukija.nextInt();
			if (pin != 3210) {
				System.out.println("V‰‰rin!");
			}
		} while (pin != 3210);
		System.out.println("Oikein!");

		lukija.close();
	}
}