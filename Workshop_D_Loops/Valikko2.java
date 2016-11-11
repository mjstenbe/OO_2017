package Workshop_D_Loops;
import java.util.Scanner;
public class Valikko2 {
		public static void main(String args[]) 
		{
			Scanner lukija = new Scanner(System.in);
			int command;
		
			do 
			{
				System.out.println("***************************");
				System.out.println("* 1 – Käynnistä auto");
				System.out.println("* 2 – Aja autoa");
				System.out.println("* 3 – Sammuta auto");
				System.out.println("* 4 – Lopeta peli");
				System.out.println("***************************");

				System.out.print("Mitä haluat tehdä? (Syötä numero 1-4) ");
			
				command = lukija.nextInt();
			
				switch (command) {
				case 1:
					System.out.println("VRUM!VRUM!\n");
					break;
				case 2:
					System.out.println("MENOKSI!\n");
					break;
				case 3:
					System.out.println("POKS!\n");
					break;
				case 4:
					System.out.println("HEIPPA!\n");
					break;
				default:
					System.out.println("Koita syöttää numero 1-4 väliltä.");
				}
				
			} while (command != 4);
			
			lukija.close();
		}
}
