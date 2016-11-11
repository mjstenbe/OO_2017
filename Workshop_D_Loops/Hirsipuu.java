package Workshop_D_Loops;
import java.util.Scanner;

public class Hirsipuu {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        //Pyydetään käyttäjältä arvattavaa sanaa
        System.out.print("Avainsana: ");
        String avain = lukija.nextLine();
    
        //Alustetaan arvoja
        int x = 1,arvausmaara = 0;
        String sana = "";
        
        //Asetetaan "sana"-muuttujan pituus samaksi kuin arvattavan sanan ja muutetaan arvot nouseviksi luvuiksi
        for(int i=avain.length()-1;i>=0;i--){
            sana = sana + x;
            x++;
        }
        
        //Aloitetaan looppi jolla tarkistetaan arvatut kirjaimet
        while(!sana.equals(avain)){
            
            System.out.print("\nArvaa kirjain: ");
            char arvaus = lukija.next().charAt(0);
            
            for(int y=0;y<avain.length();y++){
                
                if(avain.charAt(y) == arvaus){
                	//Jos arvattu sana on oikea asetetaan se paikalleen muuttujaan "sana"
                    sana = sana.replace(sana.charAt(y), arvaus);                   
                }               
            }
            
            //Looppi jolla tulostetaan arvatut vastaus jossa vain arvatut kirjaimet on paljastettu
            for(int l=0;l<sana.length();l++){
            	// Numero 228 on ä-kirjaimen numerinen arvo ja 246 on ö-kirjaimen HUOM! molemmat pieniä kirjaimia
                if((int)sana.charAt(l) == 228 || (int)sana.charAt(l) == 246){
                    System.out.print(sana.charAt(l));
                    // Merkit 122 ja 97 välillä ovat aakkoset a-z HUOM! kaikki pieniä kirjaimia
                }
                else if((int)sana.charAt(l) > 122 || (int)sana.charAt(l) < 97){
                    System.out.print("*");
                }
                else{
                	// Tulostetaan kirjain jos se läpäisee edelliset testit
                    System.out.print(sana.charAt(l));
                }
            }
            arvausmaara++;
        }
        
        if(avain.equalsIgnoreCase(sana)){
            System.out.println("\nVoitit pelin!");
            System.out.println("Arvausten määrä: "+arvausmaara);
            
        }
        
        lukija.close();
    }
}

