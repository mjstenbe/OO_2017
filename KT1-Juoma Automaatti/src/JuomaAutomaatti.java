 

import java.util.Scanner;


public class JuomaAutomaatti {
private int Tee;
private int Kahvi;
private int Kaakao;



public JuomaAutomaatti() {
	this.Tee = 50;
	this.Kahvi = 50;
	this.Kaakao = 50;
}


public int getTee() {
	return Tee;
}


public void setTee(int tee) {
	Tee = tee;
}


public int getKahvi() {
	return Kahvi;
}


public void setKahvi(int kahvi) {
	Kahvi = kahvi;
}


public int getKaakao() {
	return Kaakao;
}


public void setKaakao(int kaakao) {
	Kaakao = kaakao;
	
}
//Kahvin valmistus

	public void valmistaKahvi() {
		System.out.println("Odota hetki, Kahvisi valmistuu. ");
		if (this.Kahvi -10 < 0) {
			this.Kahvi = 0; 
			System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö.");
		}

		else this.Kahvi -= 10;

		System.out.println("Kahvia on jäljellä: " + this.Kahvi + " yksikköä. Teetä on jäljellä: " + this.Tee + " yksikköä. Kaakaota on jäljellä: " + this.Kaakao + " yksikköä." +"\n");
	}

//Teen valmistus
	
	public void valmistaTee() {
		System.out.println("Odota hetki, Teesi valmistuu. ");
		if (this.Tee -10 < 0) {
			this.Tee = 0; 
			System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö.");
		}

		else this.Tee -= 10;

		System.out.println("Kahvia on jäljellä: " + this.Kahvi + " yksikköä. Teetä on jäljellä: " + this.Tee + " yksikköä. Kaakaota on jäljellä: " + this.Kaakao + " yksikköä." +"\n");

	}

//Kaakaon valmistus
	
	public void valmistaKaakao() {
		System.out.println("Odota hetki, Kaakaosi valmistuu. ");
		if (this.Kaakao -10 < 0) {
			this.Kaakao = 0; 
			System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö.");
		}

		else this.Kaakao -= 10;

		System.out.println("Kahvia on jäljellä: " + this.Kahvi + " yksikköä. Teetä on jäljellä: " + this.Tee + " yksikköä. Kaakaota on jäljellä: " + this.Kaakao + " yksikköä." +"\n");
	}


	public static void main(String[] args){
		JuomaAutomaatti omaKone = new JuomaAutomaatti();
		Scanner lukija = new Scanner(System.in);
		String vastaus;

		do {
			System.out.println("*******       **       *******");
			System.out.println("*****  Juoma-Automaatti  *****");
			System.out.println("*******       **       *******");
			System.out.println("*         1. Kahvi           *");
			System.out.println("*         2. Tee             *");
			System.out.println("*         3. Kaakao          *");
			System.out.println("*         4. Lopeta          *");
			System.out.println("******************************");
			System.out.println("*Kirjoita valitsemasi tuotteen numero alapuolelle*");
			int input = lukija.nextInt();

			switch (input) {

			case 1:
				omaKone.valmistaKahvi();
				break;

			case 2:
				omaKone.valmistaTee();
				break;

			case 3:
				omaKone.valmistaKaakao();
				break;

			case 4:
				System.out.println("** ** ** ** ** ** ** ** ** **");
				System.out.println("Oletko varma?");
				break;

			}

			System.out.println("** ** ** ** ** ** ** ** ** **");
			System.out.println("Haluatko jatkaa tilaamista?");
			System.out.println("** ** ** ** ** ** ** ** ** **");
			System.out.println("1: Kirjoita 1, mikäli haluat jatkaa tilaamista.");
			System.out.println("2: Kirjoita 2, jos haluat lopettaa tilaamisen.");
			System.out.println("** ** ** ** ** ** ** ** ** ** ");
			vastaus = lukija.next();


		}
		while (vastaus.equalsIgnoreCase("1"));
	}
}