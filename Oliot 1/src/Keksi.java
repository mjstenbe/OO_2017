
public class Keksi {

	private int paino;
	private String nimi;

	public void setPaino(int uusiPaino) {
		if (uusiPaino > 0) {
			paino = uusiPaino;
		}
	}

	public int getPaino() {
		return paino;
	}
}
