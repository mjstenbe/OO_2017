import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;

public class KT2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KT2 frame = new KT2();
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
	public KT2() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTextArea tekstikenttä = new JTextArea();
		contentPane.add(tekstikenttä);

		setTitle("Oma Editori");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnTiedosto = new JMenu("Tiedosto");
		menuBar.add(mnTiedosto);

		// AVATAAN TIEDOSTO
		JMenuItem mntmNewMenuItem = new JMenuItem("Avaa");
		mntmNewMenuItem
				.setIcon(new ImageIcon(KT2.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Tiedoston lukeminen
				Scanner lukija = null;
				JFileChooser valintaikkuna = new JFileChooser();
				valintaikkuna.showOpenDialog(null);
				String rivi = "";
				String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();

				try {
					File tiedosto = new File(uusiTiedosto);
					lukija = new Scanner(tiedosto);
					while (lukija.hasNextLine()) {
						rivi += lukija.nextLine() + "\n";
					}
				} catch (FileNotFoundException e1) {
					System.out.println("Tiedostoa ei läydy :(");
				}
				tekstikenttä.setText(rivi);
			}
		});
		mnTiedosto.add(mntmNewMenuItem);

		// TALLENNETAAN TIEDOSTO
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tallenna");
		mntmNewMenuItem_1.setIcon(
				new ImageIcon(KT2.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tallennus
				JFileChooser valintaikkuna = new JFileChooser();
				valintaikkuna.showSaveDialog(null);
				String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
				System.out.println("Kirjoitettava tiedosto: " + uusiTiedosto);

				try {
					PrintWriter tallentaja = new PrintWriter(uusiTiedosto);
					String sisältä = tekstikenttä.getText();

					tallentaja.println(sisältä);
					tallentaja.flush();
					tallentaja.close();
				} catch (FileNotFoundException e1) {
					System.out.println("Tallennus ei onnistu :(");
				}
			}
		});
		mnTiedosto.add(mntmNewMenuItem_1);

		// LOPETETAAN OHJELMA
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lopeta");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// SULJETAAN AVOINNA OLEVA TIEDOSTO tyhjentämällä tekstikenttä
		mnTiedosto.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Sulje");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tekstikenttä.setText("");
			}
		});
		mnTiedosto.add(mntmNewMenuItem_3);

		JMenu mnMuokkaa = new JMenu("Muokkaa");
		menuBar.add(mnMuokkaa);

		// ETSITääN SANAA AUTO
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Etsi");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sisältä = tekstikenttä.getText();
				sisältä = sisältä.toLowerCase();
				String haettava = "auto";
				int indeksi = sisältä.indexOf(haettava);

				System.out.println("Indeksi: " + indeksi);
				tekstikenttä.setSelectionStart(indeksi);
				tekstikenttä.setSelectionEnd(indeksi + haettava.length());
				tekstikenttä.setSelectionColor(Color.YELLOW);
			}
		});
		mnMuokkaa.add(mntmNewMenuItem_4);

		// KORVATAAN SANA AUTO SANALLA JUNA
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Korvaa");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sisältä = tekstikenttä.getText();
				sisältä = sisältä.toLowerCase();
				String haettava = "auto";
				int indeksi = sisältä.indexOf(haettava);

				String korvaava = sisältä.replaceAll(haettava, "juna");
				tekstikenttä.setText(korvaava);
			}
		});
		mnMuokkaa.add(mntmNewMenuItem_5);

		JMenu mnTietoja = new JMenu("Tietoja");
		menuBar.add(mnTietoja);
		
		//AVATAAN TIETOIKKUNA
		JMenuItem mntmTietoja = new JMenuItem("Tietoja");
		mntmTietoja.setIcon(new ImageIcon(KT2.class.getResource("/com/sun/java/swing/plaf/motif/icons/Inform.gif")));
		mntmTietoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tämän editorin teki Tea\n:)");
			}
		});
		mnTietoja.add(mntmTietoja);

		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		contentPane.add(toolBar, BorderLayout.NORTH);

		JButton button1 = new JButton("");
		button1.setIcon(new ImageIcon(KT2.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		toolBar.add(button1);

		JButton button2 = new JButton("");
		button2.setIcon(new ImageIcon(KT2.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		toolBar.add(button2);

		JButton button3 = new JButton("");
		button3.setIcon(new ImageIcon(
				KT2.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Cut-Black.png")));
		toolBar.add(button3);

	}

}