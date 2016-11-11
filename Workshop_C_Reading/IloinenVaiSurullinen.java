package Workshop_C_Reading;

import java.util.Scanner;

public class IloinenVaiSurullinen {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		System.out.println("Kuinka vanha olet?");
		int ika = lukija.nextInt();
		
		if (ika <18 ){
			System.out.println("Olet alaikäinen!");
		}

	}

}
