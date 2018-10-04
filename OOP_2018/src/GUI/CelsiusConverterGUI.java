package GUI;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CelsiusConverterGUI {

	public static void main(String[] args) {

		JFrame ikkuna = new JFrame();

		JTextField tempTextField = new JTextField();
		JLabel celsiusLabel = new JLabel();
		JButton convertButton = new JButton();
		JLabel fahrenheitLabel = new JLabel();

		convertButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				String celsius = tempTextField.getText();
				double tempFahr = Double.parseDouble(celsius);
				tempFahr = (tempFahr * 1.8) + 32;
				
			
				
				fahrenheitLabel.setText("Fahrenheit: "+tempFahr);

			}
		});

		ikkuna.setLayout(new GridLayout(2, 2));

		celsiusLabel.setText("Celsius");
		convertButton.setText("Convert");
		fahrenheitLabel.setText("Fahrenheit");

		ikkuna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ikkuna.setTitle("Celsius Converter");

		ikkuna.add(celsiusLabel);
		ikkuna.add(tempTextField);
		ikkuna.add(convertButton);
		ikkuna.add(fahrenheitLabel);

		ikkuna.setSize(250, 100);
		//ikkuna.pack();
		ikkuna.setVisible(true);
	}

}