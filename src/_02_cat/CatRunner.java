package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat cat = new Cat("EVIL CAT THAT ATTACKS GABY'S CATS!");
	cat.meow();
	cat.printName();
	for (int i = cat.lives; i > 0; i--) {
		cat.kill();
	}
}
}
