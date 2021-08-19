package sample;

public class Wizard extends Character {
	private int mp;
	private int hp;
	private String name;
	private Wand wand;
	
	public void setHp(int hp) {
		if(hp < 0) {
			throw new IllegalArgumentException("０以上にしてください");
		} else {
			this.hp = hp;
		}
	}
	
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("0以上にしてください");
		}
		this.mp = mp;
	}
	
	public Wand getWand() {
		return this.wand;
	}
	
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("以上な値です");
		}
		this.wand = wand;
	}
	
	
	
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
