package sample;

public class StarThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			System.out.println("***");
		}
	}
}
