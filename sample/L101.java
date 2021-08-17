package sample;

public class L101 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("ポチ");
		Dog dog2 = new Dog("クロ", 5);
		Dog dog3 = new Dog("ラッキー", 3);
		
		dog1.cry();
		dog1.sitDown();
		dog2.cry();
		dog3.cry();
	}
}
