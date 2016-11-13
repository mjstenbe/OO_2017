package Workshop_E_Methods;

public class LukujenSumma {

	public static void main(String[] args) {

		// Suoritetaan aliohjelma, ei oteta palautusarvoa talteen
		LukujenSumma(11, 8);
		LukujenSumma(8, 4);

		// Suoritetaan aliohjelma, otetaan palautusarvo talteen
		int tulos = LukujenSumma(5, 2);
		System.out.println(tulos);

	}

	public static int LukujenSumma(int ekaluku, int tokaluku) {
		int summa = ekaluku + tokaluku;
		System.out.println("Summataan: " + summa);
		return summa;
	}

}
