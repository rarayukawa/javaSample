package sample;

public class Hero {
	private String name;
	int hp;
	Sword sword;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った\nHPが" + sec + "回復した");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ\n5のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は、転んだ！\nGAEOVER\n最終HPは" + this.hp + "でした");
	}
	
	public void die() {
		System.out.println(this.name + "は死んでしまった\nGAMEOVER");
		
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("５ポイントのダメージを与えた！");
		
		System.out.println("お化けキノコ" + m.suffix + "から２ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	public void kougeki() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public Hero() {
		this("ダミー");
		System.out.println("Heroのコンストラクタが動作");
	}
	
	@Override
	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
