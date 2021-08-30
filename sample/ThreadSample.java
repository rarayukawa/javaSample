package sample;

public class ThreadSample extends Thread {
	public void run() {
		System.out.println("sleep start");
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e) {
		}
		System.out.println("sleep finish");
	}
}