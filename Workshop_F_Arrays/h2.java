package Workshop_F_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class h2 {
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		int[] asana = new int[5];

		for (int i = 0; i < asana.length; i++) {
			System.out.println("Anna arvosana: ");
			asana[i] = lukija.nextInt();
			System.out.println();
		}

		Arrays.sort(asana);
		for (int i = 0; i < asana.length; i++) {
			System.out.println(asana[i]);
		}

		int summa = 0;

		for (int i = 0; i < asana.length; i++) {
			summa += asana[i];

		}
		System.out.println("\n" + "Keskiarvo on: " + summa / asana.length);
	}
}
