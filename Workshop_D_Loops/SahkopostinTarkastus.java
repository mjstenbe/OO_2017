package Workshop_D_Loops;
import java.util.Scanner;
public class SahkopostinTarkastus {
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		int kelpoisuusa, kelpoisuusb, kelpoisuusc;
		char piste = '.';
		char miukuMauku = '@';
		String sahkoposti;
		
		System.out.println("Anna sähköposti:");
		sahkoposti = lukija.nextLine();

		kelpoisuusa = sahkoposti.indexOf(piste);
		kelpoisuusb = sahkoposti.indexOf(miukuMauku);
		kelpoisuusc = sahkoposti.lastIndexOf(miukuMauku);

		if (kelpoisuusa == -1 || kelpoisuusb == -1 || sahkoposti.length() < 5 || (!(kelpoisuusc == sahkoposti.indexOf(miukuMauku)))){
			System.out.print("Epäkelpo sähköposti!");
		}
		else {
			System.out.print("Kelpo sähköposti!");
		}
		lukija.close();
	}
}
