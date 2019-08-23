
public class Rahtilaiva extends Laiva {
	
	//Luodaan luokkakohtaisia kapsuloituja muuttujia 
	private int �ljy�S�ili�ss�; 
	private String m��r�np��;
	 
	
	// konstruktori jossa asetetaan valmiit oletusarvot
			public Rahtilaiva() {
				super.laivanNimi = "Titanic";
				super.laivanRekisteritunnus = "123";
				super.nopeus = 20;
				this.�ljy�S�ili�ss� = 50;
				this.m��r�np�� = "Reykjavik";
			}
			
			//Konstruktori jonka avulla parametreja voidaan asettaa heti luontivaiheessa
			public Rahtilaiva (int uusi�ljy�S�ili�ss�, String uusim��r�np��) {
				this.�ljy�S�ili�ss� = uusi�ljy�S�ili�ss�;
				this.m��r�np�� = uusim��r�np��;
			}
	
	//Luodaan getterit ja setterit
	public int get�ljy�S�ili�ss�(){
		return �ljy�S�ili�ss�;
	}
	public void set�ljy�S�ili�ss�(int �ljy�S�ili�ss�) {
		// Ei voida asettaa �ljyn m��r�ksi negatiivista lukua
			if (�ljy�S�ili�ss� < 0) {
					System.out.print("�ljy� ei voi olla v�hemm�n kuin 0");
						this.�ljy�S�ili�ss� = 0; }
				else 
		this.�ljy�S�ili�ss� = �ljy�S�ili�ss�;
	}
	public String getM��r�np��() {
		return m��r�np��;
	}
	public void setM��r�np��(String m��r�np��) {
		this.m��r�np�� = m��r�np��;
	}
	
	//Luodaan yksil�llinen toString-metodi
	@Override
	public String toString() {
		return "Rahtilaiva " + super.toString() +  " �ljy� s�ili�ss� = " + �ljy�S�ili�ss� + ", m��r�np�� = " + m��r�np��;
	}
}