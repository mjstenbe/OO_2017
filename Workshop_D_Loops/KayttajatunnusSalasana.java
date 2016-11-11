package Workshop_D_Loops;
import java.util.Scanner;
 
public class KayttajatunnusSalasana {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                      
        String user, pw, userConf, pwConf;
		boolean success = false;
        
        System.out.println("Syötä käyttäjänimi (tallenetaan): ");
        user = sc.next();
        System.out.println("Syötä salasana (tallenetaan): ");
        pw = sc.next();
                      
        do {
        		System.out.println("Syötä käyttäjänimi ja salasana");
        		System.out.print("Käyttäjä: ");
        		userConf = sc.next();
        		System.out.print("Salasana: ");
        		pwConf = sc.next();
        		
                if (user.equals(userConf) && pw.equals(pwConf)) {
                	System.out.println("\n******Oikein meni!");
                	System.out.println("Käyttäjätunnus: " + user);
                	System.out.println("Salasana: " + pw);
                	
                	success = true;
                }
                else
                {
                	System.out.println("\n******Väärä käyttäjätunnus ja/tai salasana.\n");
                }
                                 
        } while (!success);
        
        sc.close();
	}
}