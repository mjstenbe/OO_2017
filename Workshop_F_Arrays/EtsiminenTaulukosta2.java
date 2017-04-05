package Workshop_F_Arrays;

import java.util.Scanner;

public class EtsiminenTaulukosta2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int[] lukuTaulu = {55, 23, 6456, 324, 72, 21};
        String[] nimiTaulu = {"Petteri", "Kauko", "Matti", "Minna", "Maisa", "Juuso", "Mauno"};
        System.out.println("Mitä haluat etsiä: ");
        String find = reader.nextLine();
        
        for (int i = 0; i <= lukuTaulu.length-1; ++i) {
            String num = String.valueOf(lukuTaulu[i]);
            if (find.equals(num)) {
                System.out.print("Löytyi luku taulukon alkiosta numero: " + i);
            }
        }
        for (int i = 0; i < nimiTaulu.length-1; ++i) {
            if (find.equalsIgnoreCase(nimiTaulu[i])) {
                System.out.println("Löytyi nimi taulukon alkiosta numero: " + i);
            }
        }

        reader.close();
    }

}

