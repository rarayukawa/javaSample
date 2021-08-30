package sample;

public class RunnableSample implements Runnable{
	private int count;
	@Override
	public synchronized void run() {
		for(int i = 0; i < 1000; i++) {
			count++;
		}
	}
	
	int getCount() {
		return count;
	}
}