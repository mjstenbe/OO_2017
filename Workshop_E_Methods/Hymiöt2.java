package Workshop_E_Methods;
import java.util.Scanner;

public class Hymiöt2 {
    
    public static void main(String[] args) {
        String teksti;
    	
        teksti = lueTeksti();
        
    	korvaaHymiot(teksti);
        korvaaHymiot(teksti, "&");
    }
    
    private static String lueTeksti() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Anna teksti: ");
        String teksti = reader.nextLine();
        reader.close();
        return teksti;
    }
    
    public static void korvaaHymiot(String teksti) {
        System.out.println(teksti.replaceAll(":[)]", "*"));
    }
    
    public static void korvaaHymiot(String teksti, String korvaaja) {
        System.out.println(teksti.replaceAll(":[)]", korvaaja));
    }
    
}

