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
	korvaaHymi�t(merkkijono);
	//korvaaHymi�tString(merkkijono);
	lukija.close();
}

public static void korvaaHymi�t(String teksti){
	System.out.println(teksti.replaceAll(":[)]", "*"));
}
public static void korvaaHymi�tString(String teksti){
	System.out.println(teksti.replaceAll(":D", "*"));
}

}

