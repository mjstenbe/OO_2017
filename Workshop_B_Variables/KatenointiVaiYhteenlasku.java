package Workshop_B_Variables;

public class KatenointiVaiYhteenlasku {
	public static void main(String[] args) {
		String mj1 = "pää", mj2 = "ry", mj3 = "nä";
		String hedelmä;

		// tavutetaan sana päärynä ja myös ilman tavuviivoja
		hedelmä = mj1 + "-" + mj2 + "-" + mj3;
		hedelmä = mj1 + mj2 + mj3; 

		// katenointia
		System.out.println(3 + " " + hedelmä + "ä korissa");
		System.out.println("Korissa on " + 2 + 1 + " " + hedelmä + "ä");

		// katenointia ja yhteenlaskua
		System.out.println("Korissa on " + (2 + 1) + " " + hedelmä + "ä");
		System.out.println(1 + 2 + " " + hedelmä + "ä korissa");
	}
}
