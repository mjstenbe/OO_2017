package Kirjasto_DB_retrieve;
import java.util.*;
public class K‰‰nteisetLuvut{
    public static void main(String[] args) {
    int luvut;
        Scanner lukija = new Scanner (System.in);
        // kysyt‰‰n montako lukua jemmataan
        System.out.println("Kuinka monta liukulukua haluat antaa:");
        luvut = lukija.nextInt();
        
        String[] liuku = new String[luvut];
        //OK jemmataan k‰ytt‰j‰n luvut
        for(int laskuri =0; laskuri < luvut; laskuri++){
            System.out.println("Anna"  +  (laskuri +1) +"." +  "luku:");
            liuku[laskuri] =lukija.next();
        }
        lukija.close();   
        String temp;
         int start =0;
         int end =luvut -1;
     
        while (start < end) {
             temp = liuku[start];
             liuku[start]= liuku [end];
             liuku[end] = temp;
             
             start++;
             end--;
         }
        // j‰rjestely toimii, muttei luvut , tulisi olla .
        System.out.println("Antamasi luvut k‰‰nteisess‰ j‰rjestyksess‰:");
    for(int j = 0; j<luvut; j++ ) {
         System.out.println(liuku[j]);
    }
        }
    }
