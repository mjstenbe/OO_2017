package Workshop_D_Loops;
import java.util.Scanner;
public class SahkopostinTarkastus {
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		int kelpoisuusa, kelpoisuusb, kelpoisuusc;
		String sahkoposti;
		
		System.out.println("Anna s�hk�posti:");
		sahkoposti = lukija.nextLine();

		kelpoisuusa = sahkoposti.indexOf('.');
		kelpoisuusb = sahkoposti.indexOf('@');
		kelpoisuusc = sahkoposti.lastIndexOf('@');

		if (kelpoisuusa == -1 || kelpoisuusb == -1 || sahkoposti.length() < 5 || (!(kelpoisuusc == sahkoposti.indexOf('@')))){
			System.out.print("Ep�kelpo s�hk�posti!");
		}
		else {
			System.out.print("Kelpo s�hk�posti!");
		}
		lukija.close();
	}
}
