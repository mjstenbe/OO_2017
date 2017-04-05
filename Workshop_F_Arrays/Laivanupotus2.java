package Workshop_F_Arrays;

import java.util.Scanner;
public class Laivanupotus2{
    public static void main(String[] args) {
        char[][] koordinaatisto = new char[5][5];
        
        koordinaatisto [(int) (Math.random()*4)][(int) (Math.random()*4)] ='*';
        koordinaatisto [(int) (Math.random()*4)][(int) (Math.random()*4)] ='*';
        boolean voitto = false;
        Scanner lukija = new Scanner(System.in);
        int xkoordi = 0;
        int ykoordi = 0;

        System.out.println("TERVETULOA KAPTEENI! VIHOLLISEN ARMADA LÄHESTYY, VALMISTAUTUKAA TAISTELUUN.");
        do {
            System.out.println("Anna Y koordinaatit iskulle: ");
            ykoordi = lukija.nextInt();
            System.out.println("Anna X koordinaatit iskulle: ");
            xkoordi = lukija.nextInt();
            int loytyi = 0;
            if (koordinaatisto[ykoordi][xkoordi] == '*') { 
                System.out.println("OSUMA!");
                koordinaatisto[ykoordi][xkoordi] = '\u0000';
                for (int i = 0; i < koordinaatisto.length;i++)
                {
                    for (int k = 0; k < koordinaatisto[i].length;k++){
                                                                    if (koordinaatisto[i][k] == '*') { loytyi = 1; break;}
                                                                    }
                    if (loytyi == 1) { break;}
                }                                                
            
            }
            else { System.out.println("Ohi meni! Syötä uudet koordinaatit."); loytyi = 1;}
            
            if (loytyi == 0) { voitto = true; }
            } while (voitto == false);
            System.out.println("Onneksi olkoon, vihollisen laivasto on tuhottu!");
    
    }
}


