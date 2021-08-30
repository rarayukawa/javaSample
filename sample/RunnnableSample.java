package sample;

public class RunnnableSample implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("スレッド" + name + "で動いてます");
		String threadName = Thread.currentThread().getName();
		System.out.println("スレッド" + threadName + "で動いてます");
	}
}
