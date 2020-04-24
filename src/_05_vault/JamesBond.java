package _05_vault;

import javax.swing.JOptionPane;

public class JamesBond {
	public void findCode(Vault v) {
		for (int i = 1000000; i > 0; i--) {
			if (v.tryCode(i)) {
			JOptionPane.showMessageDialog(null, "Gaby you are a genius. Yet again you break in and steel stuff. You got in with, " + i + ". \nYou get lots of money to break into more places and buy more women!");
}
		}
	}
}
