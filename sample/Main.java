package sample;

public class Main {
	public static void main(String[] args) {
		Slim s = new Slim();
		Monster m = new Slim();
		s.run();
		m.run();
		Wizard w1 = new Wizard();
		Character c = w1;
		Matango m4 = new Matango('e');
		c.name = "アサカ";
		c.attack(m4);
		Sword s3 = new Sword();
		s3.name = "炎の剣";
		s3.damage = 10;
		Hero h1 = new Hero();
		h1.sword = s3;
		
		Hero h2 = new Hero();
		Wizard w = new Wizard();
		System.out.println("現在の武器は" + h1.sword.name);
		h1.kougeki();
		
		Matango m1 = new Matango('a');
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango('s');
		m2.hp = 48;
		m2.suffix = 'B';
		
		SuperHero sh = new SuperHero();
		
		Empty e = new Empty();
		String s2 = e.toString();
		System.out.println(s2);
		
		if(h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
}
