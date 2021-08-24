package sample;

public class TestInterface4 {
	public static void main(String[] args) {
		Circum obj1 = new Circum();
		Area obj2 = new Area();
		en(obj1);
		en(obj2);
	}
	
	static void en(Circle obj ) {
		System.out.print("半径" + 10 + " ");
		System.out.println(obj.calc(10));
	}
}
