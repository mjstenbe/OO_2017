import java.util.Scanner;

public class Laiva {
	String laivanNimi;
	String laivanRekisteritunnus;
	double nopeus;
	
	//Luodaan toString-metodi jota aliluokat voivat myös hyödyntää
	@Override
	public String toString() {
		return "laivan nimi = " + laivanNimi + ", Laivan rekisteritunnus = " + laivanRekisteritunnus + ", nopeus = "
				+ nopeus;
	}

	public String getLaivanNimi() {
		return laivanNimi;
	}

	public void setLaivanNimi(String laivanNimi) {
		this.laivanNimi = laivanNimi;
	}

	public String getLaivanRekisteritunnus() {
		return laivanRekisteritunnus;
	}

	public void setLaivanRekisteritunnus(String laivanRekisteritunnus) {
		this.laivanRekisteritunnus = laivanRekisteritunnus;
	}

	public double getNopeus() {
		return nopeus;
	}

	public void setNopeus(double nopeus) {
		this.nopeus = nopeus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Luodaan aliluokista olioita
		 Rahtilaiva a = new Rahtilaiva();
		 Purjevene b = new Purjevene();
		 Rahtilaiva c = new Rahtilaiva (102, "Helsinki");
		 
		 //Tulostetaan olioita
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
		 //Tuodaan skanneri ja tarvittavat muuttujat
		 Scanner lukija = new Scanner(System.in);
		 
		 //EN IHAN SAANUT LOPPUUN TÄTÄ :)
		String nimi;
		 do {
			 //toistetaan kyselyä
			 System.out.println("Anna Purjeveneen tiedot : (tyhjä lopettaa)");
			 System.out.println("Laivan nimi : ");
			   nimi = lukija.nextLine();
			 a.setLaivanNimi(nimi);
			 }
		 while (!nimi.equals("")); {
			 System.out.print("Kiitos kun annoit määritykset");
		 }}}
	