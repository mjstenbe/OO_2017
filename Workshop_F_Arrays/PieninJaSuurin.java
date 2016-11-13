package Workshop_F_Arrays;

public class PieninJaSuurin {

	public static void main(String[] args) {
		final int alkioita = 100;
		final int maxArvo = 1000;
		int suurin = 0, pienin = maxArvo;
		int[] luvut = new int[alkioita];
		
		
		/* Alustetaan taulukko satunnaisluvuilla 1-1000 */
		for (int i = 0; i < luvut.length; i++) {
			luvut[i] = (int) (Math.random() * maxArvo);
		}/* for i */
		
		
		/* Haetaan suurin arvo taulukosta */
		for (int i = 0; i < luvut.length; i++) {
			if (luvut[i] > suurin)
				suurin = luvut[i];
		}/* for i */
		
		System.out.println("Suurin luku: " + suurin);
		System.out.println();
		
		// Haetaan pienin arvo taulukosta
		for (int i = 0; i < luvut.length; i++) {
			if (luvut[i] < pienin)
				pienin = luvut[i];
		}// for i
		
		System.out.println("Pienin luku: " + pienin);
	}// main
}
