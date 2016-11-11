package Workshop_D_Loops;
public class Kurssitaulukko {
	public static void main(String[] args) {

		final double markka = 5.94573;

		System.out.println("**************************");
		System.out.println("* Euroa     =     Markaa *");
		System.out.println("**************************");

		for (int euro = 1; euro <= 10; euro++) {
			System.out.printf("%7d", euro);

			System.out.print("     =     ");

			System.out.printf(("%.2f\n"), euro * markka);
		}
	}
}