package juomaAutomaatti;

import java.util.Scanner;

public class juoma {

	// Konstruktori puuttuu Eli muuttujien m‰‰rittel‰ tulisi olla public juoma()
	// -nimisen rakenteen sis‰ll‰
	private int tee = 50;
	private int kahvi = 50;
	private int kaakao = 50;

	public int getTee() {
		return tee;
	}

	public void setTee(int tee) {
		this.tee = tee;
	}

	public int getKahvi() {
		return kahvi;
	}

	public void setKahvi(int kahvi) {
		this.kahvi = kahvi;
	}

	public int getKaakao() {
		return kaakao;
	}

	public void setKaakao(int kaakao) {
		this.kaakao = kaakao;
	}

	public static void main(String[] args) {

		juoma omaKone = new juoma();
		Scanner lukija = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {
			System.out.println("******Juoma-Automaatti*******");
			System.out.println();
			System.out.println("1. Kahvi\r\n" + "2. Tee\r\n" + "3. Kaakao\r\n" + "4. Lopeta\r\n");
			System.out.println();
			System.out.println("******************************");
			int juoma = lukija.nextInt();

			if (omaKone.onnistuuko() == false) {
				System.out.println("Ooops... Kiitos lahjoituksesta!");
			

			} else if (juoma == 1) {
				System.out.println("Odota hetki, Kahvisi valmistuu.");
				omaKone.valmistaKahvi();

			}

			else if (juoma == 2) {
				System.out.println("Odota hetki, tee valmistuu.");
				omaKone.valmistaTee();

			}

			else if (juoma == 3) {
				System.out.println("Odota hetki, kaakao valmistuu.");
				omaKone.valmistaKaakao();

			}

			else if (juoma == 4) {
				omaKone.valmistaLopeta();
			} else if (juoma < 0 || juoma > 4) {
				System.out.println("V‰‰r‰ valinta kokeile uudelleen");
			}

			System.out.println(omaKone);
		}
	}

	public void valmistaKahvi() {
		if (kahvi <= 0) {
			System.out.println("Tuoteloppu!");
			System.out.println("Valitse toinen juoma...");
			System.out.println("Tai lopeta painamalla 4 \n");
			return;
		} else
			;
		this.kahvi -= 10; // T‰ss‰ on turha puolipiste. Se itseasiassa p‰‰tt‰‰ else lauseen ja kahvia
							// v‰hennet‰‰n joka tapauksessa, riippumatta if-lauseen vertailusta

	}

	public void valmistaTee() {
		if (tee <= 0) {
			System.out.println("Tuoteloppu!");
			System.out.println("Valitse toinen juoma...");
			System.out.println("Tai lopeta painamalla 4 \n");
			return;
		} else // T‰ss‰ on turha puolipiste. Se itseasiassa p‰‰tt‰‰ else lauseen ja kahvia
				// v‰hennet‰‰n joka tapauksessa, riippumatta if-lauseen vertailusta
			;
		this.tee -= 10;
		return;
	}

	public void valmistaKaakao() {
		if (kaakao <= 0) {
			System.out.println("Tuoteloppu!");
			System.out.println("Valitse toinen juoma...");
			System.out.println("Tai lopeta painamalla 4\n");
			return;
		} else
			;
		this.kaakao -= 10;
	}

	public void valmistaLopeta() {
		System.out.println("L‰mpimi‰ ja nautinnollisia juoma hetki‰ :) ");
		System.exit(0);

	}

	public boolean onnistuuko() {
		int luku = (int) (Math.random() * 100 + 1);
		if (luku <= 25 && luku > 0) {
			return false;
		}

		else
			return true;

	}

	@Override
	public String toString() {
		return "Teet‰ j‰ljell‰: " + tee + " Kahvia j‰ljell‰: " + kahvi + " Kaakaota j‰ljell‰ " + kaakao + "\n";
	}

}
