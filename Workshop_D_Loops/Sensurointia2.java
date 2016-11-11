package Workshop_D_Loops;
import java.util.Scanner;
public class Sensurointia2 {
    public static void main(String[] args) {
        
        Scanner arvo = new Scanner(System.in);
        int laskuri = 0;
        
        System.out.print("Anna lause: ");
        String lause = arvo.nextLine();
        System.out.print("Mitä sensuroidaan: ");
        String syöte = arvo.nextLine();
        System.out.print("Millä sensuroidaan: ");
        String sensure = arvo.nextLine();
        arvo.close();
        
        for (int i = 0; i < lause.length(); i++)
        {
            if (lause.contains(syöte))
            {
                lause = lause.replaceFirst(syöte, sensure);
                laskuri++;
            }               
        }
        System.out.println(lause);
        System.out.println("Korvatiin " + laskuri + " kohtaa.");
    }
}