package Workshop_E_Methods;

public class LoremIpsum {

	public static void main(String[] args) {
		tulostaLoremIpsumLauseKymmenesti();
	}

	public static void tulostaLoremIpsumLauseKymmenesti() {
		for (int i = 0; i < 10; ++i) {
			tulostaLoremIpsumLause();
		}
	}

	public static void tulostaLoremIpsumLause() {
		System.out.println("Lorem ipsum...");
	}

}
