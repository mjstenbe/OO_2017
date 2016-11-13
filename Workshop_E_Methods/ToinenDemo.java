package Workshop_E_Methods;

public class ToinenDemo {

	public static void main(String[] args) {

		// MetodiDemo.tulostaValikko();
		String palautusarvo = dataa();
		System.out.println(palautusarvo);
		
		System.out.println( dataa() );
		
		if ( olikoOikea() ){
			
		}
		
		
	}

	public static boolean olikoOikea(){
		return true;
	}
	
	public static String dataa() {
		String data = "";
		data = "Hiiohoi";
		return data;
	}

}
