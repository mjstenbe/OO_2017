package Workshop_C_Reading;

import java.util.Scanner;

public class Ika {

	public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);
        System.out.print("Kuinka vanha olet? ");
        int age = reader.nextInt();
        
        if (age < 18) {
            System.out.print("Olet alaik�inen");
        }
        else
        {
            System.out.print("Olet t�ysi-ik�inen");     	
        }
        reader.close();

	}

}
