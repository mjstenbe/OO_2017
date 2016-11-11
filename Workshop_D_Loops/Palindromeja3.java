package Workshop_D_Loops;
import java.util.Scanner;

public class Palindromeja3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Syötä sana: ");
        
        String sana = reader.nextLine();
        sana = sana.toLowerCase();
        sana = sana.replaceAll(" ",  "");
        
        int n = sana.length();
        boolean isit = true;
        for (int i = 0; i < (n/2); ++i) {
            if (sana.charAt(i) != sana.charAt(n-i-1))
                isit = false;
        }
        if (isit == true)
            System.out.print("Syöttämäsi sana on palindromi");
        else
            System.out.print("Syöttämäsi sana ei ole palindromi");
        reader.close();
    }

}

