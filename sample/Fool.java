package sample;

public class Fool extends Character implements Human {
	//Characterからhpやnameなどのフィールドを継承している
	//characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わずに遊んでいる");
	}
	//さらにHumanから継承した４つの抽象メソッドを実装
	public void talk() {
		System.out.println("taikメソッド");
	}
	
	public void watch() {
		System.out.println("watch");
	}
	
	public void hear() {
		System.out.println("hear");
	}
	
	public void run() {
		System.out.println("run");
	}
}
