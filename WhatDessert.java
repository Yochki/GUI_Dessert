package desserts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WhatDessert implements ActionListener {

	private static JPanel mainPanel;
	private static JFrame frame;
	private static JLabel label;
	private static JButton button;
	private static JTextField textField;
	private static JTextArea recipe;
	private static String text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.white);
		frame = new JFrame();
		frame.setSize(710, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(mainPanel);
		// Center
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

		label = new JLabel("What dessert should I make?");
		mainPanel.add(label);
		label.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		label.setBounds(130, 10, 300, 28);

		textField = new JTextField(20);
		textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textField.setForeground(Color.white);
		textField.setEditable(false);
		textField.setBackground(Color.black);
		textField.setLayout(new BoxLayout(textField, BoxLayout.Y_AXIS));
		textField.setBounds(126, 50, 200, 28);
		mainPanel.add(textField);

		button = new JButton("GO!");
		button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		button.setBounds(180, 100, 80, 28);
		button.setBackground(Color.black);
		button.setForeground(Color.white);
		button.addActionListener(new WhatDessert());
		mainPanel.add(button);

		recipe = new JTextArea();
		recipe.setBounds(0, 150, 700, 400);
		recipe.setBackground(Color.black);
		recipe.setForeground(Color.white);
		recipe.setEditable(false);
		mainPanel.add(recipe);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		int random = (int) (Math.random() * 10) + 1;
		if (random == 1) {
			textField.setText(" Cupcakes!");
			loadFile("cupcakes.txt");
		} else if (random == 2) {
			textField.setText(" Tiramisu!");
			loadFile("tiramisu.txt");
		} else if (random == 3) {
			textField.setText(" Cookies!");
			loadFile("cookies.txt");
		} else if (random == 4) {
			textField.setText(" Gingerbread!");
			loadFile("gingerbread.txt");
		} else if (random == 5) {
			textField.setText(" Ice cream cake!");
			loadFile("IceCreamCake.txt");
		} else if (random == 6) {
			textField.setText(" Fudge!");
			loadFile("fudge.txt");
		} else if (random == 7) {
			textField.setText(" Chocolate muffins!");
			loadFile("ChocolateMuffins.txt");
		} else if (random == 8) {
			textField.setText(" Snickers cake!");
			loadFile("SnickersCake.txt");
		} else if (random == 9) {
			textField.setText(" Peach pie!");
			loadFile("PeachPie.txt");
		} else {
			textField.setText(" Eclairs!");
			loadFile("eclairs.txt");
		}
	}

	void loadFile(String fileName) {
		File myObj = new File(fileName);
		text = "";
		try {
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				text += myReader.nextLine() + "\n";
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			try {
				myObj.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		recipe.setText(text);
	}
}
