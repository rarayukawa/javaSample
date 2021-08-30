package sample;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Chara boy = new Chara("少年");
		Chara girl = new Chara("少女");
		boy.start();
		girl.start();
		boy.join();
		girl.join();
		System.out.println("終了");
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
	synchronized static void process(Chara ch) {
		for(int i = 0; i < 5; i++) {
			System.out.println(ch.name + "は戦闘中です");
		}
	}
}
