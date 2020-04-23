package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	Microwave x = new Microwave();
	String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn y = new Popcorn(flavor);
	x.putInMicrowave(y);
	String time = JOptionPane.showInputDialog("How long do you want the popcorn in the microwave in minutes?");
	int timeInt = Integer.parseInt(time);
	x.setTime(timeInt);
	x.startMicrowave();
}
}
