package Workshop_D_Loops;
import java.util.Scanner;

public class Palindromeja {

	public static void main(String[] args) {

		String sy�te, v��rinp�in;
		int pituus;
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna sy�te: ");
		sy�te = lukija.nextLine();
		
		// Poistetaan v�lily�nnit
		sy�te = sy�te.replaceAll(" ", "");
		pituus = sy�te.length();

		v��rinp�in = "";
		
		for (int i = pituus-1; i >= 0; i--) {
			v��rinp�in += sy�te.charAt(i);
		}
		
		if ( sy�te.equalsIgnoreCase(v��rinp�in) ){
			System.out.println("Kyseess� on palindromi.");
		}
		else {
			System.out.println("Ei ollut.");
		}
		
		lukija.close();
	}
}
