 
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tekstieditorix extends JFrame {
	JEditorPane editorPane = new JEditorPane();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tekstieditorix frame = new Tekstieditorix();
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
	public Tekstieditorix() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTiedosto = new JMenu("Tiedosto");
		menuBar.add(mnTiedosto);
		
		JMenuItem mntmAvaa = new JMenuItem("Avaa");
        mntmAvaa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFileChooser valintaikkuna = new JFileChooser();
                valintaikkuna.showOpenDialog(null);
                valintaikkuna.setApproveButtonText("Avaa tiedosto");
                valintaikkuna.setDialogTitle("Tiedoston valinta");
                String rivi = "";
                String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();

                try {

                Scanner lukija = null;
                File tiedosto = new File (uusiTiedosto);
                lukija = new Scanner (tiedosto);

                while (lukija.hasNextLine())  {
                    rivi += lukija.nextLine()+"\n";
                    System.out.println(rivi);
                }

                } catch (FileNotFoundException p) {
                    System.out.println("Tiedostoa ei löydy..");
                }

                editorPane.setText(rivi);

            }
        });

		
		mntmAvaa.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/javax/swing/plaf/metal/icons/ocean/newFolder.gif")));
		mntmAvaa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnTiedosto.add(mntmAvaa);
		
		JMenuItem mntmTallenna = new JMenuItem("Tallenna");
		mntmTallenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFileChooser valintaikkuna = new JFileChooser();
	                valintaikkuna.showSaveDialog(null);

	                String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();

	                System.out.println("Kirjoitettava tiedosto: "+uusiTiedosto);
	                
	                // Tallennuksen hoitava koodi
				try {
					PrintWriter writer = new PrintWriter("Tiedosto.txt");
					String sisalto = editorPane.getText();
					
					writer.println(sisalto);
					
					writer.flush();
					writer.close();
				} catch (Exception e1) {
					System.out.println("Tiedoston tallennuksessa tapahtui virhe!");
					e1.printStackTrace();
				}
			}
			});
		mntmTallenna.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		mntmTallenna.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnTiedosto.add(mntmTallenna);
		
		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		mntmLopeta.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/com/sun/java/swing/plaf/motif/icons/Error.gif")));
		mntmLopeta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK));
		mnTiedosto.add(mntmLopeta);
		
		JMenuItem mntmSulje = new JMenuItem("Sulje");
		mntmSulje.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		mnTiedosto.add(mntmSulje);
		
		JMenu mnMuokkaa = new JMenu("Muokkaa");
		menuBar.add(mnMuokkaa);
		
		JMenuItem mntmEtsi = new JMenuItem("Etsi");
		mntmEtsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Etsi-toiminnallisuus
				
				String sisalto = editorPane.getText();
				sisalto = sisalto.toLowerCase();
				
				String haettava = "auto";
				int indeksi = sisalto.indexOf("Auto");
				System.out.println("Indeksi: "+indeksi);
				editorPane.setSelectionColor(Color.YELLOW);
				
				editorPane.setSelectionStart(indeksi);
				editorPane.setSelectionEnd(indeksi + haettava.length() );
				
			}
		});
		mntmEtsi.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/javax/swing/plaf/metal/icons/ocean/expanded.gif")));
		mnMuokkaa.add(mntmEtsi);
		
		JMenuItem mntmKorvaa = new JMenuItem("Korvaa");
		mntmKorvaa.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/com/sun/javafx/scene/web/skin/IncreaseIndent_16x16_JFX.png")));
		mnMuokkaa.add(mntmKorvaa);
		
		JMenu mnTietoja = new JMenu("Tietoja");
		menuBar.add(mnTietoja);
		
		JMenuItem mntmTietojaOhjelmasta = new JMenuItem("Tietoja ohjelmasta");
		mntmTietojaOhjelmasta.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		mnTietoja.add(mntmTietojaOhjelmasta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Tekstieditorix.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Cut-Black.png")));
		toolBar.add(btnNewButton_2);
		
		
		contentPane.add(editorPane, BorderLayout.CENTER);
	}

}