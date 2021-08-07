package sample;
import java.util.Random;


public class Cleric {
	String name;
	int hp;
	final int MAX_HP = 50;
	int mp;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！\nHPが最大まで回復した！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}
	
	public int play(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った");
		int recover = Math.min(this.MAX_MP - this.mp, new Random().nextInt(3) + sec);
		this.mp += recover;
		System.out.println("MPが" + recover + "回復した");
		return recover;
	}
	
}
