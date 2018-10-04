import java.util.Scanner;

public class Kekstitehdas {

	public static void main(String[] args) {

		int luku = 10;
		Scanner lukija = new Scanner(System.in);
		String nimi = "Mika";

		Keksi MikanKeksi = new Keksi();
		System.out.println(MikanKeksi);
		
		Keksi MaijanKeksi = new Keksi("Oreo");		
		System.out.println(MaijanKeksi);
		
		Keksi MatinKeksi = new Keksi("Domino", 50, "12/10/1998");
		System.out.println(MatinKeksi);

		MikanKeksi.getPaino();
		MikanKeksi.setPaino(50);




	}

}
