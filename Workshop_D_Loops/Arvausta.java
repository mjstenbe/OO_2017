package Workshop_D_Loops;
import java.util.Scanner;

public class Arvausta {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Anna sana: ");
        String sana = reader.nextLine();
        System.out.print("Arvaa kirjain: ");
        String kirjain = reader.nextLine();
        
        int num = sana.length();
        int c = -1;
        
        if (sana.contains(kirjain)) {
            c = sana.indexOf(kirjain);
            System.out.println("Löytyy kohdasta: " + c);
        }
        
        for (int i=0; num >= 0 && i >= 0; ++i) {
            if (i == c) {
                System.out.print(sana.charAt(i));
                --num;
            }
            else
                System.out.print("*");
                --num;
        }
        reader.close();
    }
}

