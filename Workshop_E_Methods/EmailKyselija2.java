package Workshop_E_Methods;

import java.util.Scanner;

public class EmailKyselija2 {

	public static void main(String[] args) {

		String sposti = kysyEmail();
		System.out.println(sposti);
	}

	public static String kysyEmail() {
		Scanner lukija = new Scanner(System.in);
		String email = "invalid_email";
		
		while (email.indexOf('@') < 0){
			System.out.print("Anna email: ");
			email = lukija.nextLine();
		};
		
		return email;
	}

}
