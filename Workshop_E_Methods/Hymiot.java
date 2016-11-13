package Workshop_E_Methods;
import java.util.Scanner;

public class Hymiot {
public static void main(String[] args) {
	lueTeksti();
}

public static void lueTeksti(){
	Scanner lukija = new Scanner(System.in);
	System.out.println("Anna merkkijono: ");
	String merkkijono = lukija.nextLine();
	korvaaHymiöt(merkkijono);
	//korvaaHymiötString(merkkijono);
	lukija.close();
}

public static void korvaaHymiöt(String teksti){
	System.out.println(teksti.replaceAll(":[)]", "*"));
}
public static void korvaaHymiötString(String teksti){
	System.out.println(teksti.replaceAll(":D", "*"));
}

}

