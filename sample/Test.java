package sample;

public class Test {
	public static void main(String[] args) {
		Chara boy = new Chara("少年");
		Chara girl = new Chara("少女");
		boy.start();
		girl.start();
	}
}

class Chara extends Thread {
	String name;
	Chara(String name) {
		this.name = name;
	}
	public void run() {
		Battle.process(this);
	}
}

class Battle {
	static Object lock = new Object();
	static void process(Chara ch) {
		synchronized(lock) {
			for(int i = 0; i < 5; i++) {
				System.out.println(ch.name + "は攻撃しました");
			}
		}
	}
}
