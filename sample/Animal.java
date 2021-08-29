package sample;

public abstract class Animal {
	String name;
	int age;
	
	public Animal(String name) {
		this.name = name;
		this.age = 10;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("寝る");
	}
	public abstract void speak();
	public abstract void eat();
	
}
