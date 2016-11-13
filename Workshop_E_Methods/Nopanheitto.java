package Workshop_E_Methods;

public class Nopanheitto {

	public static void main(String[] args) {
		int osumat = 0;
		int laskuri = 0;

		// Toistetaan nopanheittoa, kunnes osumia 10
		do {
			int tulos = heitaNoppaa();
			// Lasketaan heittojen määrä
			laskuri++;

			// Lasketaan myös osumat 6:een
			
			if (tulos == 6) {
				osumat++;
			}
		} while (osumat != 10);

		System.out.println("Osumia: " + osumat);
		System.out.println("Heittoja kertyi: " + laskuri);

	}

	public static int heitaNoppaa() {

		// Arvotaan satunnaisluku 1-6
		int tulos = (int) (Math.random() * 6 + 1);

		return tulos;
	}

}
