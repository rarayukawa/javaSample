package sample;

public class Wizard extends Character {
	private int mp;
	private int hp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHP”を" + recoverPoint + "回復した！");
	}
	
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
