package Workshop_B_Variables;

public class KatenointiVaiYhteenlasku {
	public static void main(String[] args) {
		String mj1 = "p��", mj2 = "ry", mj3 = "n�";
		String hedelm�;

		// tavutetaan sana p��ryn� ja my�s ilman tavuviivoja
		hedelm� = mj1 + "-" + mj2 + "-" + mj3;
		hedelm� = mj1 + mj2 + mj3; 

		// katenointia
		System.out.println(3 + " " + hedelm� + "� korissa");
		System.out.println("Korissa on " + 2 + 1 + " " + hedelm� + "�");

		// katenointia ja yhteenlaskua
		System.out.println("Korissa on " + (2 + 1) + " " + hedelm� + "�");
		System.out.println(1 + 2 + " " + hedelm� + "� korissa");
	}
}
