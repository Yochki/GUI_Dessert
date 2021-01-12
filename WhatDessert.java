package demo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WhatDessert {
	
	private static JPanel mainPanel;
	private static JFrame frame;
	private static JLabel label;
	private static JButton button;
	private static JTextField textField; 
	private static JTextArea recipe;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setLayout(null);
		frame = new JFrame();
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(mainPanel);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

		textField = new JTextField(20);
		textField.setEditable(false);
		textField.setLayout(new BoxLayout(textField, BoxLayout.Y_AXIS));
		textField.setBounds(205, 85, 200, 35);
		mainPanel.add(textField);
		
		button = new JButton("GO!");
		button.setBounds(265, 135, 80, 35);
		mainPanel.add(button);

		recipe = new JTextArea();
		recipe.setBounds(0, 200, 600, 200);
		recipe.setEditable(false);
		recipe.setText("Recipe: ");
		mainPanel.add(recipe);
		
		label = new JLabel("What dessert should I make?");
		mainPanel.add(label);
		label.setBounds(220, 40, 300, 35);
		
		frame.setVisible(true);
	}

}
