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
	private static JLabel title;
	private static JButton GObutton;
	private static JTextField nameOfTheDessert;
	private static JTextArea recipe;
	private static String text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.white);
		frame = new JFrame();
		frame.setSize(740, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(mainPanel);
		// Center
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

		title = new JLabel("What dessert should I make?");
		mainPanel.add(title);
		title.setFont(new Font("Sitka Display", Font.PLAIN, 18));
		title.setBounds(258, 10, 300, 28);

//		susdawane na pole na koeto izpishe imeto na izbraniq desert
		nameOfTheDessert = new JTextField(20);
		nameOfTheDessert.setFont(new Font("Sitka Display", Font.PLAIN, 17));
		nameOfTheDessert.setForeground(Color.black);
		nameOfTheDessert.setEditable(false);
		nameOfTheDessert.setBackground(Color.white);
		nameOfTheDessert.setLayout(new BoxLayout(nameOfTheDessert, BoxLayout.Y_AXIS));
		nameOfTheDessert.setBounds(256, 50, 200, 28);
		mainPanel.add(nameOfTheDessert);
 
		GObutton = new JButton("GO!");
		GObutton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		GObutton.setBounds(316, 100, 80, 28);
		GObutton.setBackground(Color.black);
		GObutton.setForeground(Color.white);
		GObutton.addActionListener(new WhatDessert());
		mainPanel.add(GObutton);

		recipe = new JTextArea();	
		recipe.setBounds(10, 150, 700, 400);
		recipe.setBackground(Color.white);
		recipe.setForeground(Color.black);
		recipe.setFont(new Font("Sitka Display", Font.PLAIN, 17));
		recipe.setEditable(false);
//		formatira texta da e w ramkite na textArea-ta
		recipe.setLineWrap(true);
		recipe.setWrapStyleWord(true);
		mainPanel.add(recipe);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

//		random izbirane na 1 ot 10 deserta 
		int random = (int) (Math.random() * 10) + 1;
		if (random == 1) {
			nameOfTheDessert.setText(" Cupcakes!");
			loadFile("cupcakes.txt");
		} else if (random == 2) {
			nameOfTheDessert.setText(" Tiramisu!");
			loadFile("tiramisu.txt");
		} else if (random == 3) {
			nameOfTheDessert.setText(" Cookies!");
			loadFile("cookies.txt");
		} else if (random == 4) {
			nameOfTheDessert.setText(" Gingerbread!");
			loadFile("gingerbread.txt");
		} else if (random == 5) {
			nameOfTheDessert.setText(" Ice cream cake!");
			loadFile("IceCreamCake.txt");
		} else if (random == 6) {
			nameOfTheDessert.setText(" Fudge!");
			loadFile("fudge.txt");
		} else if (random == 7) {
			nameOfTheDessert.setText(" Chocolate muffins!");
			loadFile("ChocolateMuffins.txt");
		} else if (random == 8) {
			nameOfTheDessert.setText(" Snickers cake!");
			loadFile("SnickersCake.txt");
		} else if (random == 9) {
			nameOfTheDessert.setText(" Peach pie!");
			loadFile("PeachPie.txt");
		} else {
			nameOfTheDessert.setText(" Eclairs!");
			loadFile("eclairs.txt");
		}
	}

//	chetat se filovete ot clasa Recipes.java
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
