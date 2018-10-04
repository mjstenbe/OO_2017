package JuomaAutomaatti;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Kayttis extends JFrame {

	private JPanel contentPane;
	static JuomaAutomaatti auto;
	private JLabel kahviInfo;
	private JTextArea textArea;
	private JLabel teeInfo;
	private JLabel kaakaoInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kayttis frame = new Kayttis();
					auto = new JuomaAutomaatti();
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
	public Kayttis() {
		setTitle("Juoma-automaatti v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnTilaaKahvi = new JButton("Tilaa kahvi");
		btnTilaaKahvi.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnTilaaKahvi.setForeground(Color.ORANGE);
		btnTilaaKahvi.setBackground(Color.PINK);
		btnTilaaKahvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auto.valmistaKahvi();
				p‰ivit‰Info();
			}
		});
		btnTilaaKahvi.setBounds(20, 130, 89, 23);
		contentPane.add(btnTilaaKahvi);

		JButton btnTilaaTee = new JButton("Tilaa Tee");
		btnTilaaTee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				auto.valmistaTee();
				p‰ivit‰Info();

			}
		});
		btnTilaaTee.setBounds(149, 130, 89, 23);
		contentPane.add(btnTilaaTee);

		JButton btnTilaaKaakao = new JButton("Tilaa Kaakao");
		btnTilaaKaakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auto.valmistaKaakao();
				p‰ivit‰Info();

			}
		});
		btnTilaaKaakao.setBounds(277, 130, 117, 23);
		contentPane.add(btnTilaaKaakao);

		kahviInfo = new JLabel("Kavia j\u00E4ljell\u00E4");
		kahviInfo.setBackground(Color.LIGHT_GRAY);
		kahviInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kahviInfo.setBounds(20, 88, 83, 39);
		contentPane.add(kahviInfo);

		teeInfo = new JLabel("Teet\u00E4 j\u00E4ljell\u00E4");
		teeInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		teeInfo.setBackground(Color.LIGHT_GRAY);
		teeInfo.setBounds(149, 88, 83, 39);
		contentPane.add(teeInfo);

		kaakaoInfo = new JLabel("Kaakaota j\u00E4ljell\u00E4");
		kaakaoInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kaakaoInfo.setBackground(Color.LIGHT_GRAY);
		kaakaoInfo.setBounds(277, 88, 117, 39);
		contentPane.add(kaakaoInfo);
		
			textArea = new JTextArea();
			textArea.setBounds(10, 190, 371, 256);
			contentPane.add(textArea);
			textArea.setFont(new Font("Monospaced", Font.PLAIN, 17));

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\miksten\\Pictures\\kahvia.jpg"));
		lblNewLabel.setBounds(10, 11, 104, 59);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\miksten\\Pictures\\250px-Meissen-teacup_pinkrose01.jpg"));
		label.setBounds(139, 11, 104, 59);
		contentPane.add(label);

		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\miksten\\Pictures\\250px-Becher_Kakao_mit_Sahneh\u00E4ubchen.JPG"));
		label_1.setBounds(277, 11, 104, 59);
		contentPane.add(label_1);
	}

	protected void p‰ivit‰Info() {

		String info = auto.toString();
		textArea.setText(info);

		kahviInfo.setText("Kahvia: " + auto.getKahvi());

		teeInfo.setText("Teet‰: " + auto.getTee());

		kaakaoInfo.setText("Kaakaota: " + auto.getKaakao());

	}
}
