package Workshop_D_Loops;
import java.util.Scanner;
 
public class KayttajatunnusSalasana {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                      
        String user, pw, userConf, pwConf;
		boolean success = false;
        
        System.out.println("Sy�t� k�ytt�j�nimi (tallenetaan): ");
        user = sc.nextLine();
        System.out.println("Sy�t� salasana (tallenetaan): ");
        pw = sc.nextLine();
                      
        do {
        		System.out.println("Sy�t� k�ytt�j�nimi ja salasana");
        		System.out.print("K�ytt�j�: ");
        		userConf = sc.nextLine();
        		System.out.print("Salasana: ");
        		pwConf = sc.nextLine();
        		
                if (user.equals(userConf) && pw.equals(pwConf)) {
                	System.out.println("\n******Oikein meni!");
                	System.out.println("K�ytt�j�tunnus: " + user);
                	System.out.println("Salasana: " + pw);
                	
                	success = true;
                }
                else
                {
                	System.out.println("\n******V��r� k�ytt�j�tunnus ja/tai salasana.\n");
                }
                                 
        } while (!success);
        
        sc.close();
	}
}