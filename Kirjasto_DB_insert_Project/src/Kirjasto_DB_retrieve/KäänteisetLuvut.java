package Kirjasto_DB_retrieve;
import java.util.*;
public class KäänteisetLuvut{
    public static void main(String[] args) {
    int luvut;
        Scanner lukija = new Scanner (System.in);
        // kysytään montako lukua jemmataan
        System.out.println("Kuinka monta liukulukua haluat antaa:");
        luvut = lukija.nextInt();
        
        String[] liuku = new String[luvut];
        //OK jemmataan käyttäjän luvut
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
        // järjestely toimii, muttei luvut , tulisi olla .
        System.out.println("Antamasi luvut käänteisessä järjestyksessä:");
    for(int j = 0; j<luvut; j++ ) {
         System.out.println(liuku[j]);
    }
        }
    }
