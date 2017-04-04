package Workshop_D_Loops;
import java.util.Scanner;

public class Hirsipuu3 {

	public static void main(String[] args) {
		int MAX_GUESSES = 5;
		String hidden = "";
		char[] guess;
		int hits=0, wrongGuesses=0;
		Boolean rightGuess = false;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		word = word.toLowerCase();
		
		// Build a 'hidden' word containing asterisks. Same length as the provided word
		for (int i=0; i<word.length(); i++)
		{
			hidden = hidden + '*';
		}

		// Convert both strings to an array of chars
		char[] wordArray = word.toCharArray();
		char[] hiddenArray = hidden.toCharArray();
		
		do {
			System.out.print("Enter a guess: ");
			guess = reader.nextLine().toCharArray();
			
			for (int i=0; i<wordArray.length; i++)
			{
				if (wordArray[i]==guess[0])
				{
					hiddenArray[i]=guess[0]; // Replace an asterisk with the correct guess
					++hits;
					rightGuess=true;
				}
			}
			
			if (!rightGuess)
			{
				++wrongGuesses;
				System.out.println("Wrong guess. " + (MAX_GUESSES - wrongGuesses) + " attempts left");
			}
			else
			{
				System.out.println("Right guess!");
			}

			System.out.println(String.valueOf(hiddenArray));
			
			if (hits == wordArray.length )
			{
				System.out.println("Congratulations! You discovered the word!");
				break;
			}
			else if (wrongGuesses == MAX_GUESSES)
			{
				System.out.println("Sorry! You died!");
				break;				
			}
			else
			{
				rightGuess=false;
				continue;
			}
			
		} while (true);
		
		reader.close();
	}

}
