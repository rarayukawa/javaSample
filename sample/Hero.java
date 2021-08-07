package sample;

public class Hero {
	String name;
	int hp;
	
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
}
