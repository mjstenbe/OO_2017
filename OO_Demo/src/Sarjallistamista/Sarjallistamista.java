package Sarjallistamista;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Sarjallistamista {
// Tallennetaan Auto-olio sarjallistettuna tiedostoon

	private static void serializeToXML(Auto oma) throws IOException {
		FileOutputStream fos = new FileOutputStream("Auto.xml");
		XMLEncoder encoder = new XMLEncoder(fos);

		encoder.setExceptionListener(new ExceptionListener() {
			public void exceptionThrown(Exception e) {
				System.out.println("Exception! :" + e.toString());
			}
		});
		encoder.writeObject(oma);
		encoder.close();
		fos.close();
	}

	private static Auto deserializeFromXML() throws IOException {
		FileInputStream fis = new FileInputStream("Auto.xml");
		XMLDecoder decoder = new XMLDecoder(fis);
		Auto decodedAuto = (Auto) decoder.readObject();
		decoder.close();
		fis.close();
		return decodedAuto;
	}

	public static void main(String[] args) throws Exception { // eli ei käsitellä poikkeuksia

		FileOutputStream apuTied = new FileOutputStream("AutotTallessa.oma");
		ObjectOutputStream talteen = new ObjectOutputStream(apuTied);

		Auto a = new Auto();
		Auto b = new Auto();

		a.setAutonMerkki("Ferrari");
		b.setAutonMerkki("Honda");
		a.setNopeus(100);
		b.setNopeus(200);
		a.setVuosimalli(1999);
		b.setVuosimalli(2010);
		a.setAjokilometrit(180000);
		b.setAjokilometrit(167000);

		System.out.println(a);
		System.out.println(b);

		talteen.writeObject(a);
		talteen.writeObject(b);

		talteen.flush(); // !!
		apuTied.close(); // !!

		serializeToXML(a);
		Auto c = deserializeFromXML();
		System.out.println(c);
	}
}