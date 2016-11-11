package Workshop_D_Loops;
import java.util.Scanner;

public class doubleLoops {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Size of triangle: ");
		int size = reader.nextInt();
		System.out.println("");
		int counter = 1;
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < counter; ++j) {
				System.out.print(0 + " ");
			}
			++counter;
			System.out.println("");
		}
		reader.close();
	}

}