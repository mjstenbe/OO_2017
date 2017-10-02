package Workshop_D_Loops;

import java.util.Scanner;

public class Sahkoposti1 {

	public static void main(String[] args){	
		Scanner lukija = new Scanner(System.in);
	
		System.out.println("Anna sähköpostiosoitteesi:");
	
		String email = lukija.nextLine();
	
		if (email.indexOf('@') > 0 && (email.indexOf('@')==email.lastIndexOf('@')) && email.indexOf('.') > 0 && email.length() > 5){
			System.out.println("Syöte on kelvollinen!"); 
		}
		else {
	  		  System.out.println("Sähköpostiosoite on virheellinen!");
		}
	  
	  lukija.close();
}
}
