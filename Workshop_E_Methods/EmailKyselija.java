package Workshop_E_Methods;

import java.util.Scanner;

public class EmailKyselija {

	public static void main(String[] args) {

		String sposti = kysyEmail();
		System.out.println(sposti);
	}

	public static String kysyEmail() {
		Scanner lukija = new Scanner(System.in);
		boolean loytyi;
		char merkki;
		String email;
		do {
			System.out.print("Anna email: ");
			email = lukija.nextLine();
			merkki = '@';
			int merkinSijainti = email.indexOf(merkki);
			loytyi = (merkinSijainti != -1);
		} while (loytyi != true);
		return email;
	}

}
