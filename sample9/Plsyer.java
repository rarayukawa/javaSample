package sample9;

public class Plsyer {
	private String name;
	private int age;
	private long point;
	
	public Plsyer (String name, int age, long point) {
		this.name = name;
		this.age = age;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public long getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return getName() + "," + getAge() + "," + getPoint();
	}
}
