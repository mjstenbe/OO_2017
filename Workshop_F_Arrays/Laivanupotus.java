package Workshop_F_Arrays;
import java.util.Scanner;

public class Laivanupotus {

	public static void main(String[] args) {
		
		byte[][] taulu = new byte[5][5]; // ei t‰h‰n mit‰‰n charreja kannata k‰ytt‰‰
		
		for (int i = 0; i < taulu.length; i++){
			for (int j = 0; j < taulu[0].length; j++){
				taulu[i][j] = 0;		//t‰yteen tyhj‰‰
			}
		}

		//sijotetaan laivat:
		taulu[2][4] = 1;
		taulu[4][3] = 1;
		taulu[0][2] = 1;
		taulu[1][1] = 1;
		taulu[3][3] = 1;
		
		Scanner s = new Scanner(System.in);
		int x,y;
		int bodycount = 0;
		
		while (true){
			
			if (bodycount==5){break;}
			
			System.out.print("Anna koordinaatti X: ");
			x=s.nextInt();
			System.out.print("Anna koordinaatti Y: ");
			y=s.nextInt();
			System.out.println();
			
			if (x>4 || y>4)
			{
				System.out.println("Input out of range. Max values for x or y is 4. Try again");
				continue;
			}
			
			if(taulu[x][y]==1){
				System.out.println("Osu ja upposi!");
				taulu[x][y]=0; // vaihdetaan tyhj‰ks
				bodycount++;
			} else {
				System.out.println("Ohi meni!");
			}
			
		}
		
		System.out.println("GAME OVER");
		
	}

}
