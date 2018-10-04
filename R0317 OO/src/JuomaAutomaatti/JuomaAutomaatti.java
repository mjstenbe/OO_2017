package JuomaAutomaatti;
import java.util.Scanner;

class JuomaAutomaatti {

	private int kahvi, tee, kaakao, luku;

	public JuomaAutomaatti() {
		kahvi = 50;
		tee = 50;
		kaakao = 50;
	}

	public int getKahvi() {
		return kahvi;
	}

	public void setKahvi(int kahvi) {
		this.kahvi = kahvi;
	}

	public int getTee() {
		return tee;
	}

	public void setTee(int tee) {
		this.tee = tee;
	}

	public int getKaakao() {
		return kaakao;
	}

	public void setKaakao(int kaakao) {
		this.kaakao = kaakao;
	}

	int onnistuuko() {
		luku = (int) (Math.random() * 100 + 1);
		System.out.println("Random luku " + luku);
		return luku;
	}

	public boolean onkoLoppu() {
		if (kahvi == 0 && tee == 0 && kaakao == 0)
			return true;
		else
			return false;
	}

	public void valmistaKahvi() {

		luku = onnistuuko();
		if (kahvi == 0) {
			System.out.println("Kahvi on valitettavasti loppu.");
		} else {
			if (luku > 25) {
				kahvi -= 10;
				System.out.println("Odota hetki kahvia valmistetaan");
				System.out.println("Kahvia jäljellä: " + kahvi);
			} else {
				System.out.println("Kahvia ei pystytty toimittamaan, kiitos kuitenkin maksustasi.");
			}
		}
	}

	public void valmistaTee() {
		luku = onnistuuko();
		if (tee == 0) {
			System.out.println("Tee on valitettavasti loppu.");
		} else {
			if (luku > 25) {
				tee -= 10;
				System.out.println("Odota hetki teetä valmistetaan");
				System.out.println("Teetä jäljellä: " + tee);
			} else {
				System.out.println("Teetä ei pystytty toimittamaan, kiitos kuitenkin maksustasi.");
			}
		}
	}

	public void valmistaKaakao() {
		luku = onnistuuko();
		if (kaakao == 0) {
			System.out.println("Kaakao on valitettavasti loppu.");
		} else {
			if (luku > 25) {
				kaakao -= 10;
				System.out.println("Odota hetki kaakaota valmistetaan");
				System.out.println("Kaakaota jäljellä: " + kaakao);
			} else {
				System.out.println("Kaakaota ei pystytty toimittamaan, kiitos kuitenkin maksustasi");
			}
		}
	}

	public String toString() {

		String esitys = "\n";
		esitys += "*******Juoma-Automaatti*******\n";
		esitys += "\n";
		esitys += "1. Kahvi" + "\n";
		esitys += "2. Tee" + "\n";
		esitys += "3. Kaakao\n";
		esitys += "\n";
		esitys += "******************************";
		return esitys;
	}



	public static void main(String[] args) {

		JuomaAutomaatti i = new JuomaAutomaatti();
		Scanner lukija = new Scanner(System.in);

		do {

			if (i.onkoLoppu()) {
				System.out.println("Kaikki juomat on loppu!");
				break;
			}

			System.out.println(i);
			int valinta = lukija.nextInt();

			switch (valinta) {
			case 1:
				i.valmistaKahvi();
				break;
			case 2:
				i.valmistaTee();
				break;
			case 3:
				i.valmistaKaakao();
				break;
			default:
				System.out.println("Valitse tuote 1-3 väliltä");
				break;
			}
		} while (true);

		lukija.close();
	}
}