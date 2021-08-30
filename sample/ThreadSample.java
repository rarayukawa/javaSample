package sample;

public class ThreadSample extends Thread {
	public void run() {
		System.out.println("スレッド" + getName() + "で動いてます");
	}
}
