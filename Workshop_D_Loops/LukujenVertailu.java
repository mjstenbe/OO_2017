package Workshop_D_Loops;
import java.util.Scanner;
public class LukujenVertailu {
	public static void main(String[] args) {
		int ika;
		
		Scanner syote = new Scanner(System.in);
		System.out.println("Sy�t� ik�: ");
		ika = syote.nextInt();
		
		if (ika<0 || ika>150) {
			System.out.println("Virheellinen ik�!");
		}
		else if (ika<6) {
			System.out.println("Esikoululainen");
		}
		else if (ika>=6 && ika<14)
		{
			System.out.println("Olet lapsi");
		}
		else if (ika==14) {
			System.out.println("Haastava ik�");
		}
		else if (ika >=16 && ika<18) {
			System.out.println("L�hes aikuinen");
		}
		else if (ika>=18 && ika<30) {
			System.out.println("Olet t�ysi-ik�inen, muttet viel� keski-i�n kriisiss�");
		}
		else if (ika>=30 && ika<45) {
			System.out.println("Olet keski-i�ss�");
		}
		else if (ika>45 && ika<65) {
			System.out.println("Viel� ehtii ennen el�kett�!");
		}
		else {
			System.out.println("Olet el�kel�inen");
		}
		
		syote.close();
	}
}

