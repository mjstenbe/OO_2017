package Workshop_D_Loops;

import java.util.Scanner;

public class Sahkoposti1 {

	public static void main(String[] args){	
		Scanner lukija = new Scanner(System.in);
	
		System.out.println("Anna s�hk�postiosoitteesi:");
	
		String email = lukija.nextLine();
	
		if (email.indexOf('@') > 0 && (email.indexOf('@')==email.lastIndexOf('@')) && email.indexOf('.') > 0 && email.length() > 5){
			System.out.println("Sy�te on kelvollinen!"); 
		}
		else {
	  		  System.out.println("S�hk�postiosoite on virheellinen!");
		}
	  
	  lukija.close();
}
}
