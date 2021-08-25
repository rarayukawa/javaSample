package sample;

public abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println("寝る");
	}
	public abstract void speak();
	public abstract void eat();
}
