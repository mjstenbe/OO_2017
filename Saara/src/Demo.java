

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Demo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea textArea;

JEditorPane editorPane = new JEditorPane();
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Demo frame = new Demo();
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
    public Demo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("Tiedosto");
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Avaa");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l) {
            
            	JFileChooser valintaikkuna = new JFileChooser();
            	valintaikkuna.showOpenDialog(null);
            	String rivi = "";
            	String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
            	
                Scanner lukija = null;
               // File tiedosto = new File ("src//gradu.txt");
                File tiedosto = new File (uusiTiedosto);
                //Luetaan tiedostoa rivikerrallaan
                //Varaudutaan poikkeuksiin try-catch-rakenteella
                try {
                    lukija = new Scanner(tiedosto);
                    String kokoteksti ="";
                    while (lukija.hasNextLine()){
                        String teksti = lukija.nextLine();
                        System.out.println(rivi);
                        kokoteksti += teksti+"\n";
                    }
                    textArea.setText(kokoteksti);
                }
                catch (FileNotFoundException e) {
                    System.out.println("Tiedostoa ei löydy...");
                    }
            }
        });
        mnNewMenu.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tallenna");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		JFileChooser valintaikkuna = new JFileChooser();
            	valintaikkuna.showSaveDialog(null);
            	
            	String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
            	System.out.println("Kirjoitettava tiedosto: " + uusiTiedosto);
            	
            	try {
            		PrintWriter writer = new PrintWriter("Tiedosto.txt");
            		String sisalto = editorPane.getText();
            		writer.println (sisalto);
            		
            		writer.flush();
            		writer.close();
            		
            	} catch (Exception j) {
            		System.out.println("Tiedoston tallennuksessa tapahtui virhe!");
            		j.printStackTrace();
            	}
        	}
        });
        mnNewMenu.add(mntmNewMenuItem_1);
        
        JMenu mnNewMenu_1 = new JMenu("Muokkaa");
        menuBar.add(mnNewMenu_1);
    
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Etsi");
        mnNewMenu_1.add(mntmNewMenuItem_2);
        mntmNewMenuItem.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        	//Etsi-toiminnallisuus
        		String sisalto = editorPane.getText();
        		sisalto = sisalto.toLowerCase();
        		
        		String haettava = "minä";
				int indeksi = sisalto.indexOf(haettava);
        		System.out.println("Indeksi: " +indeksi);
        		
        		editorPane.setSelectionColor(Color.YELLOW);
        		
        		editorPane.setSelectionStart(indeksi);
        		editorPane.setSelectionEnd(indeksi + haettava.length());
        	}
        });
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 0, 414, 226);
        contentPane.add(scrollPane);
        
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
    }
    public JTextArea getTextArea() {
        return textArea;
    }
}

