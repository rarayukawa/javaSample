package sample;

public class Rectangle {
	static int counter = 0;
	int width;
	int height;
	static int getCounter() {
		return counter;
	}
	Rectangle(int w, int h) {
		setSize(w, h);
		counter++;
	}
	
	Rectangle() {
		setSize(10, 20);
		counter++;
	}
	
	void setSize(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("r1.width = " + r1.width + "\nr1.height = " + r1.height + "\nr1.getArea() = " + r1.getArea() + "\nコンストラクタの数" + counter + "\n" + r1);
		Rectangle r2 = new Rectangle(123, 45);
		System.out.println("r2.width = " + r2.width + "\nr2.height = " + r2.height + "\nr2.getArea() = " + r2.getArea() + "\nコンストラクタの数" + counter + "\n" + r2);
	}
	@Override
	public String toString() {
		return "Rectangle(" + width + ", " + height + ")";
	}
}
