import java.util.Scanner;

public class ForToisto {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int luku;
		System.out.print("Anna kokonaisluku: ");
		luku = lukija.nextInt();
		for (luku = 0; luku > 0; luku--) {
			if (luku > 0)
				continue;
		}
		System.out.println(luku);
	}

}
