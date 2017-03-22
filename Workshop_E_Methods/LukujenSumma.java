package Workshop_E_Methods;

public class LukujenSumma {

	public static void main(String[] args) {

		// Suoritetaan aliohjelma, ei oteta palautusarvoa talteen
		summa(11, 8);
		summa(8, 4);

		// Suoritetaan aliohjelma, otetaan palautusarvo talteen
		int tulos = summa(5, 2);
		System.out.println(tulos);

	}

	public static int summa(int ekaluku, int tokaluku) {
		int summa = ekaluku + tokaluku;
		System.out.println("Summataan: " + summa);
		return summa;
	}

}
