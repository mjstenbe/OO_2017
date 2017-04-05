package Workshop_F_Arrays;

public class Teht1 {
	public static void main(String[] args) {
		int[] kokluktaul = { 5, 7, 32, 31, 8 };
		double[] desluktaul = { 12.4, -13.55, 67.44 };
		String[] merkkitaul = { "Helsinki", "Lissabon", "New York", "Shanghai" };
		
		// a) Tulosta ruudulle lause ”Alkiossa numero 3 on :
		// ” ja liitä perään merkkijonotaulukon kolmas alkio
		System.out.print("A) " + merkkitaul[2]);
		System.out.println();
		
		// b) Tulosta ruudulle lause ”Alkiossa numero 5 on :
		// ” ja liitä perään kokonaislukutaulukon viides alkio
		System.out.print("B) " + kokluktaul[4]);
		System.out.println();
		
		// c) Tulosta ruudulle lause ”Desimaalitaulukossa on XX arvoa”,
		// jossa liität XX:n perään ko. taulukon pituuden kertovan
		// kentän nimen
		System.out.print("C) Desimaalitaulukossa on " + desluktaul.length
				+ " arvoa");
		System.out.println();
		
		// d) Kirjoita kokonaislukutaulukkoa varten for-lause,
		// jolla tulostat taulukon sisällön ruudulle
		System.out.print("D) Kokonailukutaulukko: ");
		for (int laskuri = 0; laskuri < kokluktaul.length; laskuri++) {
			System.out.print(kokluktaul[laskuri] + " ");
		}
		System.out.println();
		
		// e) Kirjoita desimaalilukutaulukkoa varten for –lause,
		// jolla tulostat taulukon käänteisessä järjestyksessä
		System.out.print("E) Desimaalitaulukon käänteisessä järjestyksessä: ");
		for (int i = desluktaul.length - 1; i >= 0; --i) {
			System.out.print(desluktaul[i] + " ");
		}
		System.out.println();
		
		// f) Kirjoita merkkijonotaulukkoa varten do-while – lause,
		// jolla asetat alkioiden arvoksi tekstin ”Tyhjä”.
		int laskr = 0;
		do {
			merkkitaul[laskr] = "";
			laskr++;
		} while (laskr < merkkitaul.length);
	}
}
