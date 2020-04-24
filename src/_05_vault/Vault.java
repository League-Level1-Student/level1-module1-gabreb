package _05_vault;

import java.util.Random;

public class Vault {
	private int secretCode;
	public boolean tryCode(int guess) {
		return secretCode == guess;
	}
	
	Vault() {
		secretCode = new Random().nextInt(1000000);
		System.out.println(secretCode);
	}

	
}




