
public class Rahtilaiva extends Laiva {
	
	//Luodaan luokkakohtaisia kapsuloituja muuttujia 
	private int öljyäSäiliössä; 
	private String määränpää;
	 
	
	// konstruktori jossa asetetaan valmiit oletusarvot
			public Rahtilaiva() {
				super.laivanNimi = "Titanic";
				super.laivanRekisteritunnus = "123";
				super.nopeus = 20;
				this.öljyäSäiliössä = 50;
				this.määränpää = "Reykjavik";
			}
			
			//Konstruktori jonka avulla parametreja voidaan asettaa heti luontivaiheessa
			public Rahtilaiva (int uusiöljyäSäiliössä, String uusimääränpää) {
				this.öljyäSäiliössä = uusiöljyäSäiliössä;
				this.määränpää = uusimääränpää;
			}
	
	//Luodaan getterit ja setterit
	public int getÖljyäSäiliössä(){
		return öljyäSäiliössä;
	}
	public void setÖljyäSäiliössä(int öljyäSäiliössä) {
		// Ei voida asettaa öljyn määräksi negatiivista lukua
			if (öljyäSäiliössä < 0) {
					System.out.print("Öljyä ei voi olla vähemmän kuin 0");
						this.öljyäSäiliössä = 0; }
				else 
		this.öljyäSäiliössä = öljyäSäiliössä;
	}
	public String getMääränpää() {
		return määränpää;
	}
	public void setMääränpää(String määränpää) {
		this.määränpää = määränpää;
	}
	
	//Luodaan yksilöllinen toString-metodi
	@Override
	public String toString() {
		return "Rahtilaiva " + super.toString() +  " Öljyä säiliössä = " + öljyäSäiliössä + ", määränpää = " + määränpää;
	}
}