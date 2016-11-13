package Example_programs_lectures;

import java.util.Scanner;

public class IndentedFor {
	public static void main(String[] args) {	
		int i,j;
		int rows, columns;
		
		Scanner inputReader = new Scanner(System.in);
		
		System.out.println("How many rows?: ");
		rows = inputReader.nextInt();
		System.out.println("How many columns?: ");
		columns = inputReader.nextInt();
		
		for (i=1; i<=rows; i++) //each iteration of 'i' prints one row
		{
			//each iteration of 'j' prints one column in a specific row
			for (j=1; j<=columns; j++) 
			{
				//using printf so we can nicely format the output
				System.out.printf("%4d", (i*j)); 
			}
			
			System.out.println(); //Print a newline to start a new row
		}

		inputReader.close();
	}
}
