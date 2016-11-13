package Workshop_F_Arrays;

import java.util.Scanner;

public class Arvosanoja {
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		int[] nimet = new int[10];
		int[] jakauma = new int[6];

		for (int i = 0; i < nimet.length; i++) {

			System.out.println("Anna " + i + ". opiskelijan arvosana: ");
			int luku = lukija.nextInt();
			jakauma[luku]++;
			// Saman asian ajaa ao. rivi
			// jakauma[luku]=jakauma[luku]+1; 

		}
		System.out.print("\nTULOKSET:\n");

		// Tulostetaan ensin eri arvosanojen määrät

		for (int i = 0; i < jakauma.length; i++) {
			System.out.println(i + " : " + jakauma[i]);
		}

		// Sitten sama tähdillä

		System.out.println();
		
		for (int i = 0; i < jakauma.length; i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < jakauma[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("\n\nYhteensä: " + nimet.length + " opiskelijaa. \n");
	}
}
