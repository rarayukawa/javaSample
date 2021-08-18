package sample;

public abstract class Character {
	int hp;
	String name;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
}
