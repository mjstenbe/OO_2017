package Workshop_D_Loops;
import java.util.Scanner;
public class Sensurointia2 {
    public static void main(String[] args) {
        
        Scanner arvo = new Scanner(System.in);
        int laskuri = 0;
        
        System.out.print("Anna lause: ");
        String lause = arvo.nextLine();
        System.out.print("Mit� sensuroidaan: ");
        String sy�te = arvo.nextLine();
        System.out.print("Mill� sensuroidaan: ");
        String sensure = arvo.nextLine();
        arvo.close();
        
        for (int i = 0; i < lause.length(); i++)
        {
            if (lause.contains(sy�te))
            {
                lause = lause.replaceFirst(sy�te, sensure);
                laskuri++;
            }               
        }
        System.out.println(lause);
        System.out.println("Korvatiin " + laskuri + " kohtaa.");
    }
}