package Kirjasto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class KirjaPaneeliGUI extends JFrame {
	private JTextField nimiKentta;
	private JTextField tekijaKentta;
	private JTextField julkaisuKentta;

 

	/**
	 * Create the panel.
	 *
	 */
	public KirjaPaneeliGUI() {
		setTitle("Kirjan sy\u00F6tt\u00F6-ohjelma");
		getContentPane().setLayout(null);

		JLabel lblKirjanSytt = new JLabel("Kirjan hallinta");
		lblKirjanSytt.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblKirjanSytt.setBounds(34, 27, 195, 20);
		getContentPane().add(lblKirjanSytt);

		JLabel lblKirjanNimi = new JLabel("Kirjan nimi:");
		lblKirjanNimi.setBounds(34, 94, 111, 20);
		getContentPane().add(lblKirjanNimi);

		JLabel lblTekij = new JLabel("Tekij\u00E4:");
		lblTekij.setBounds(34, 139, 111, 20);
		getContentPane().add(lblTekij);

		JLabel lblJulkaisuvuosi = new JLabel("Julkaisuvuosi:");
		lblJulkaisuvuosi.setBounds(34, 189, 111, 20);
		getContentPane().add(lblJulkaisuvuosi);

		nimiKentta = new JTextField();
		nimiKentta.setBounds(148, 91, 146, 26);
		getContentPane().add(nimiKentta);
		nimiKentta.setColumns(10);

		tekijaKentta = new JTextField();
		tekijaKentta.setColumns(10);
		tekijaKentta.setBounds(148, 136, 146, 26);

		getContentPane().add(tekijaKentta);

		julkaisuKentta = new JTextField();
		julkaisuKentta.setColumns(10);
		julkaisuKentta.setBounds(148, 186, 146, 26);
		getContentPane().add(julkaisuKentta);

		JButton lisaaNappi = new JButton("Lis\u00E4\u00E4 kirja");
		lisaaNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		lisaaNappi.setBounds(34, 244, 115, 29);
		getContentPane().add(lisaaNappi);

		JButton tyhjennaNappi = new JButton("Tyhjenn\u00E4");
		tyhjennaNappi.setBounds(192, 244, 115, 29);
		getContentPane().add(tyhjennaNappi);
		JFormattedTextField formattedTextField = null;

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\miksten\\Downloads\\old-book.jpg"));
		lblNewLabel.setBounds(322, 78, 162, 181);
		getContentPane().add(lblNewLabel);
		setLocation(100,200);
	

	}

}
