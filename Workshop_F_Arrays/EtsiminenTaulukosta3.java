package Workshop_F_Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class EtsiminenTaulukosta3 {
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		String s=null;
		int[] lukuTaulu = {55, 23, 6456, 324, 21, 234 , 72, 21};
		String[] nimiTaulu = {"Petteri", "Kauko", "Matti", "Minna", "Maisa", "Juuso", "Mauno"};
		System.out.println("Mitä haluat etsiä?");
		s = lukija.nextLine();
		if(s.matches("\\d+")){  // Using regular expressions here
			int x = Integer.parseInt(s);
			for(int i=0;i<lukuTaulu.length;i++){
				if(x==lukuTaulu[i]){
					System.out.println("Luku löytyi lukutaulukon alkiosta numero: " + (i+1));
					break;
				}else if(i+1==lukuTaulu.length){
					System.out.println("Ei löytynyt lukua.");
				}
			}
		}
		else{
			for(int i=0;i<nimiTaulu.length;i++){
				if(s.equals(nimiTaulu[i])){
					System.out.println("Luku löytyi nimitaulukon alkiosta numero: " + (i+1));
					break;
				}else if(i+1==nimiTaulu.length){
					System.out.println("Ei löytynyt nimeä.");
				}
			}
		}
	}
}
