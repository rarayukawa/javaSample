package sample;

public class Hero {
	String name;
	int hp;
	Sword sword;
	
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
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("５ポイントのダメージを与えた！");
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
}
