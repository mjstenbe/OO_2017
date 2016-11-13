package Workshop_E_Methods;

public class MetodiDemo {

	public static int ik‰ = 10;

	public static void main(String[] args) {

		System.out.println("Ollaan main-metodissa.");

		// Kutsutaan metodia ilman parametreja
		tulostaValikko();

		System.out.println("Palattiin  takaisin.");

		// Kutsutaan metodia parametrilla (kuormitettu metodi)
		tulostaValikko("P‰‰valikko");
		tulostaValikko("Menu");
		tulostaValikko("Joku muu");

	}

	public static void tulostaValikko() {

		System.out.println("***************");
		System.out.println("* VALIKKO     *");
		System.out.println("***************");

	}

	public static void tulostaValikko(String valikonNimi) {

		System.out.println("***************");
		System.out.println("* " + valikonNimi + "*");
		System.out.println("***************");

	}

}
