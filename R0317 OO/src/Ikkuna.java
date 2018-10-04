import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ikkuna {

	public static void main(String[] args) {

		JFrame ikkuna = new JFrame();
		JFrame toinenIkkuna = new JFrame("Toinen ikkuna!");
		
		JButton nappi = new JButton("OK");
		JButton nappi2 = new JButton();
		JTextArea kentta = new JTextArea();
				
		nappi.setText("OK");
		nappi2.setText("Peruuta");
		kentta.setText("Kirjoita tähän jotain!");
		
		
		ikkuna.add(nappi);
		ikkuna.add(nappi2);
		ikkuna.add(kentta);
		
		ikkuna.setSize(300, 300);
		ikkuna.setTitle("Uusi ikkuna");
		ikkuna.pack();
				
		ikkuna.setVisible(true);
		//toinenIkkuna.setVisible(true);
		
		System.out.println( kentta.getText() );
		
		

	}

}
