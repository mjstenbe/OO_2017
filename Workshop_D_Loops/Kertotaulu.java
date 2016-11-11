package Workshop_D_Loops;
import java.util.Scanner;

public class Kertotaulu {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Anna luku: ");
		int luku = reader.nextInt();
		
		System.out.print(luku + ":n kertotaulu 1-20 on:\n\n");
		
		for(int i = 1; i<=20; ++i) {
			System.out.println(luku + " x " + i + " = " + (i*luku));
		}
		reader.close();
	}
}