package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Nappi {

	public static void main(String[] args) {

		JFrame ikkuna = new JFrame();
		JButton nappi = new JButton("Klikkaa");
		ikkuna.add(nappi);
		ikkuna.pack();
		ikkuna.setVisible(true);

		nappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Painoit nappia " + e.getActionCommand());
			}
		});

	}

}
