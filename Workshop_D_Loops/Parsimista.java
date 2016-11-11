package Workshop_D_Loops;
public class Parsimista {

	public static void main(String[] args) {

		String HTML = "<h1>Eka otsikko</h1><p>Teksti‰</p>";
		
		// Etsit‰‰n alku- ja lopput‰gien indeksit
		int alku = HTML.indexOf("<h1>");
		int loppu = HTML.indexOf("</h1>");
		
		// Poimitaan yo. indeksien v‰linen teksti
		// substring-metodia k‰ytt‰en talteen
		
		String teksti = HTML.substring(alku, loppu);
		System.out.println(teksti);
		
		// Viilataan alku-indeksi‰ hieman, jotta 
		// itse t‰gi ei tule mukaan (+4)
		
		teksti = HTML.substring(alku+4, loppu);
		System.out.println(teksti);		
	
	}
	
}
