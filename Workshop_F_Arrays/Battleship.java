package Workshop_F_Arrays;

import java.util.Scanner;
public class Battleship {
    public static void main(String[] args) {
        char[][] koordinaatisto = new char[5][5];


        boolean enemyinbound = true;
        Scanner lukija = new Scanner(System.in);
        System.out.println(" ______     ______     ______   ______   __         ______     ______     __  __     __     ______  \n" +
                "/\\  == \\   /\\  __ \\   /\\__  _\\ /\\__  _\\ /\\ \\       /\\  ___\\   /\\  ___\\   /\\ \\_\\ \\   /\\ \\   /\\  == \\ \n" +
                "\\ \\  __<   \\ \\  __ \\  \\/_/\\ \\/ \\/_/\\ \\/ \\ \\ \\____  \\ \\  __\\   \\ \\___  \\  \\ \\  __ \\  \\ \\ \\  \\ \\  _-/ \n" +
                " \\ \\_____\\  \\ \\_\\ \\_\\    \\ \\_\\    \\ \\_\\  \\ \\_____\\  \\ \\_____\\  \\/\\_____\\  \\ \\_\\ \\_\\  \\ \\_\\  \\ \\_\\   \n" +
                "  \\/_____/   \\/_/\\/_/     \\/_/     \\/_/   \\/_____/   \\/_____/   \\/_____/   \\/_/\\/_/   \\/_/   \\/_/   \n" +
                "                                                                                                    ");
        System.out.println("\t\t\t\t          # #  ( )\n" +
                "                                       ___#_#___|__\n" +
                "                                   _  |____________|  _\n" +
                "                            _=====| | |            | | |==== _\n" +
                "                      =====| |.---------------------------. | |====\n" +
                "        <--------------------'   .  .  .  .  .  .  .  .   '--------------/\n" +
                "          \\                                                             /\n" +
                "           \\___________________________________________________________/\n" +
                "       wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "     wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww \n");


        System.out.println("Welcome captain! The enemy fleet approaches, get ready for engagement!");
        enemyfleet(koordinaatisto);
        boolean enemyhit = false;
        do {
            enemyhit = Attack(koordinaatisto);
            if (enemyhit == false) {
                System.out.println("We missed the target, sir. Loading cannons for next strike...");
            } else {
                enemyinbound = radar(koordinaatisto);
            }

        } while (enemyinbound == true);

        System.out.println("Congratulation captain, the enemy fleet has been destroyed!");

    }
    private static boolean Attack(char[][] koordinaatisto){
        int xkoordi = 0;
        int ykoordi = 0;
        boolean enemyhit = false;
        Scanner lukija = new Scanner(System.in);
        System.out.println("Captain, the cannons are ready to fire on your command!");
        do {   System.out.println("Give Y coordinate for the attack: ");
            ykoordi = lukija.nextInt();

             if (ykoordi < 0 || ykoordi > 4) {
                 System.out.println("That is not a proper Y coordinate for an attack, try again");
                 continue;
             }
             System.out.println("Give X coordinate for the attact: ");
             xkoordi = lukija.nextInt();
             if (xkoordi < 0 || xkoordi > 4) {
                 System.out.println("That is not a proper X coordinate for an attack, try again");
                 continue;
             }
             break;
            } while(true);
             System.out.println("3...2...1...FIRE!");
             if (koordinaatisto[ykoordi][xkoordi] == '*') {
                 System.out.println("Direct hit!");
                 koordinaatisto[ykoordi][xkoordi] = '\u0000';
                 enemyhit = true;
                    }
                    return enemyhit;
        }
    private static void enemyfleet(char[][]koordinaatisto)
    {   System.out.println("Enemy fleet moving into position...");
        int enemyy;
        int enemyx;
        int ships = 0;
        for (; ships < 5;) {
            enemyy = (int) (Math.random()*4);
            enemyx = (int) (Math.random()*4);
                    if (koordinaatisto[enemyy][enemyx] != '*') { koordinaatisto[enemyy][enemyx] = '*'; ships++; }

        }


    }
    private static boolean radar(char[][] koordinaatisto) {
        System.out.println("Radar is scanning...");
        boolean found = false;
        for (int i = 0; i < koordinaatisto.length; i++) {
            for (int k = 0; k < koordinaatisto[i].length; k++) {
                if (koordinaatisto[i][k] == '*') {
                    found = true;
                    break;
                }
            }
            if ( found == true){
                System.out.println("Radar detects enemy ships in the area. The battle continues.");
                break;
            }
        }
        return found;
    }

}