package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Dialog.ModalityType;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField passwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Welcome to this App!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(39, 16, 328, 73);
		contentPane.add(lblNewLabel);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(29, 105, 110, 20);
		contentPane.add(lblLogin);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(29, 141, 110, 20);
		contentPane.add(lblPassword);

		login = new JTextField();
		login.setBounds(140, 102, 146, 26);
		contentPane.add(login);
		login.setColumns(10);

		passwd = new JTextField();
		passwd.setBounds(140, 141, 146, 26);
		contentPane.add(passwd);
		passwd.setColumns(10);

		omaPaneeli jp = new omaPaneeli();
		JDialog od = new JDialog(this, "My Dialog", ModalityType.APPLICATION_MODAL);
		od.getContentPane().add(jp);
		od.pack();
		od.setLocationRelativeTo(this);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				od.setVisible(true);
				String a = jp.getTextField().getText();
				
				System.out.println(a);
			
			}
		});
		btnLogin.setBounds(140, 200, 115, 29);
		contentPane.add(btnLogin);
	}
}
