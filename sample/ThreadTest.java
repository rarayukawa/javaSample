package sample;

public class ThreadTest {
	public static void main(String[] args) {
		new Thread(new EqualThread()).start();
		new Thread(new StarThread()).start();
	}
}
