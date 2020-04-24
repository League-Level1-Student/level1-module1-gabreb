package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary implements ActionListener {
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	JFrame frame = new JFrame();
	public void run() {
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(answer);
	JButton button = new JButton();
	panel.add(button);
	button.setText("convert");
	frame.pack();
	frame.setTitle("Convert 8 bits of binary to ASCII");
	frame.pack();
	button.addActionListener(this);
	panel.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(convert(answer.getText())+ "              ");
		frame.pack();
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

}
