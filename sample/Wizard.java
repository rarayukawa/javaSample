package sample;

public class Wizard extends Character {
	int mp;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！\n敵に３ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！\n敵に２０ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}
