package Workshop_D_Loops;
import java.util.Scanner;

public class Hirsipuu2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Anna yksi sana: ");
		String sana = reader.nextLine();
		sana = sana.toLowerCase();
		
		/* Works with a limited number of incorrect guesses. Also keeps track of total guesses
		and correctly guessed letters */
		
		int wrong = 5;
		int guesses = 0;
		String arvatut = "";
		
		while (wrong > 0) {
			++guesses;
			System.out.print("Arvaa kirjain: ");
			String kirjain = reader.nextLine();
			String mixed = "";
			if (sana.contains(kirjain) && !arvatut.contains(kirjain)) {
				arvatut += kirjain;
				
				// Use replaceAll to replace all except correctly guessed letters with * and store in mixed
				// The first parameter in the replaceAll method is a "regular expression"
				mixed += sana.replaceAll("[^" + arvatut + "]", "*");
				
				System.out.println("Arvasit oikein: " + mixed);
				
				// If mixed no longer contains any *, player wins and breaks out of loop
				if (!mixed.contains("*")) {
					System.out.println("Arvasit koko sanan! Arvauksia: " + guesses + ".");
					break;
				}
			}
			else if (wrong == 1) {
				System.out.println("Game over");
				break;
			}
			else 
			{
				--wrong;
				System.out.println("Arvasit v‰‰rin tai olet jo k‰ytt‰nyt kirjaimen. " + wrong + " v‰‰r‰‰ arvausta j‰ljell‰");	
			}
		}
		reader.close();
	}

}
