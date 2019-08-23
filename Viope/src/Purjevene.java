
public class Purjevene extends Laiva {
	
	//Luodaan luokkakohtaisia kapsuloituja muuttujia 
	private double tuulenNopeus; 
	private float tuulenSuunta;
	
		// konstruktori jossa oletusarvot ovat tyhjiä
		public Purjevene() {
			super.laivanNimi = "Nimetön";
			super.laivanRekisteritunnus = "000";
			super.nopeus = 0;
			this.tuulenNopeus = 0;
			this.tuulenSuunta = 0;
		}
		
		//Konstruktori jonka avulla parametrit voidaan asettaa heti luontivaiheessa
		public Purjevene (double uusiTuulenNopeus, float uusiTuulenSuunta) {
			this.tuulenNopeus = uusiTuulenNopeus;
			this.tuulenSuunta = uusiTuulenSuunta;
		}
	
	//Getterit ja setterit
	public double getTuulenNopeus() 
	{
		return tuulenNopeus;
	}
	public void setTuulenNopeus(double tuulenNopeus) {
		// Ei voida asettaa tuulen nopeudeksi negatiivista lukua
				if (tuulenNopeus < 0) {
					System.out.print("Nopeus ei voi olla vähemmän kuin 0");
					this.tuulenNopeus = 0; }
				else 
		this.tuulenNopeus = tuulenNopeus;
	}
	public float getTuulenSuunta() {
		return tuulenSuunta;
	}
	public void setTuulenSuunta(float tuulenSuunta) {
		this.tuulenSuunta = tuulenSuunta;
	}
	
	@Override
	public String toString() {
		return "Purjevene " + super.toString() + "Tuulen nopeus = " + tuulenNopeus + ", Tuulen suunta = " + tuulenSuunta;
	}
}