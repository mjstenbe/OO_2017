public class Overiksi {

	public static void main(String[] args) {

		int[] taulu = new int[10];

		try {
			// Kokeillaan suorittaa

			for (int i = 0; i < 15; i++)
				System.out.println(taulu[i]);

		} catch (Exception omaPoikkeus) {
			// Mitä tehdään kun poikkeus tapahtuu
			System.out.println("Tapahtui virhe! Indeksi kasvoi liian suureksi!");

		}

		System.out.println("Hoi Maailma!");

	}
}