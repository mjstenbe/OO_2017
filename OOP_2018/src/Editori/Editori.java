package Editori;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Editori extends JFrame {

	private JPanel contentPane;
	JEditorPane editorPane;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editori frame = new Editori();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Editori() {

		setTitle("Oma Editori");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnTiedosto = new JMenu("Tiedosto");
		menuBar.add(mnTiedosto);

		JMenuItem mntmAvaa = new JMenuItem("Avaa");
		mntmAvaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/////////////////////////
				// Tiedoston lukeminen

				JFileChooser valintaikkuna = new JFileChooser();
				valintaikkuna.showOpenDialog(null);

				String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();

				Scanner lukija = null;
				// File tiedosto = new File("src//gradu.txt");
				File tiedosto = new File(uusiTiedosto);
				String rivi = "";
				// Luetaan tiedostoa skannerin avulla rivi kerrallaan
				// Varaudutaan poikkeuksiin try-catch -rakenteella

				try {

					lukija = new Scanner(tiedosto);

					while (lukija.hasNextLine()) {
						rivi += lukija.nextLine() + "\n";
						System.out.println(rivi);
					}

				} catch (FileNotFoundException p) {
					System.out.println("Tiedostoa ei löydy..");
				}

				editorPane.setText(rivi);
			}

			/////////////////////////

		});
		mnTiedosto.add(mntmAvaa);

		JMenuItem mntmTallenna = new JMenuItem("Tallenna");
		mntmTallenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Tiedoston tallennusikkuna

				JFileChooser valintaikkuna = new JFileChooser();
				valintaikkuna.showSaveDialog(null);

				String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
				
				System.out.println("Kirjoitettava tiedosto: "+uusiTiedosto);
				
				// Tänne kirjoitetaan Tallennuksen hoitava koodi

				try {

					PrintWriter writer = new PrintWriter( uusiTiedosto );
					String sisalto = editorPane.getText();

					writer.println(sisalto);

					// Vakiotoimet
					writer.flush();
					writer.close();

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("Tiedoston tallennuksessa tapahtui virhe!");
					e1.printStackTrace();
				}

			}
		});
		mnTiedosto.add(mntmTallenna);

		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnTiedosto.add(mntmLopeta);

		JMenuItem mntmSulje = new JMenuItem("Sulje");
		mnTiedosto.add(mntmSulje);

		JMenu mnMuokkaa = new JMenu("Muokkaa");
		menuBar.add(mnMuokkaa);

		JMenuItem mntmEtsi = new JMenuItem("Etsi");
		mntmEtsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Avataan ikkuna hakusanaa  varten
				
				String haettava = 
				JOptionPane.showInputDialog(null, null, "Anna haettava", 2);
											
				// Lisää tähän etsi-toiminnallisuus
				
				String sisalto = editorPane.getText();
				sisalto = sisalto.toLowerCase();
				
				// String haettava = "auto";
				int indeksi = sisalto.indexOf(haettava);
				System.out.println("Indeksi: "+indeksi);
				
				editorPane.setSelectionColor(Color.YELLOW);
				
				editorPane.setSelectionStart(indeksi);
				editorPane.setSelectionEnd( indeksi + haettava.length() );
				
				
				
			}
		});
		mnMuokkaa.add(mntmEtsi);

		JMenuItem mntmKorvaa = new JMenuItem("Korvaa");
		mnMuokkaa.add(mntmKorvaa);

		JMenu mnTietoja = new JMenu("Tietoja");
		menuBar.add(mnTietoja);

		JMenuItem mntmVersio = new JMenuItem("Tietoja ohjelmasta");
		mnTietoja.add(mntmVersio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Tiedoston lukeminen

				JFileChooser valintaikkuna = new JFileChooser();

				// Hienosäätöä
				valintaikkuna.setApproveButtonText("Avaa tiedosto");
				valintaikkuna.setDialogTitle("Tiedoston valinta");

				valintaikkuna.showOpenDialog(null);
				String rivi = "";
				String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();

				try {

					Scanner lukija = null;
					// File tiedosto = new File("src//gradu.txt");
					File tiedosto = new File(uusiTiedosto);

					// Luetaan tiedostoa skannerin avulla rivi kerrallaan
					// Varaudutaan poikkeuksiin try-catch -rakenteella

					lukija = new Scanner(tiedosto);

					while (lukija.hasNextLine()) {
						rivi += lukija.nextLine() + "\n";
						System.out.println(rivi);
					}

				} catch (FileNotFoundException p) {
					System.out.println("Tiedostoa ei löydy..");
				}
				editorPane.setText(rivi);
			}

			/////////////////////////

		});

		button.setIcon(new ImageIcon(Editori.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		toolBar.add(button);

		JButton button_1 = new JButton("");
		button_1.setIcon(
				new ImageIcon(Editori.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		toolBar.add(button_1);

		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setIcon(new ImageIcon(
				Editori.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Cut-Black@2x.png")));
		toolBar.add(button_2);

		editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(editorPane, BorderLayout.CENTER);
	}
}