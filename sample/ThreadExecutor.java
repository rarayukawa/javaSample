package sample;

public class ThreadExecutor {
	public static void main(String[] args) {
		ThreadSample t1 = new ThreadSample();
		ThreadSample t2 = new ThreadSample();
		ThreadSample t3 = new ThreadSample();
		t1.start();
		t2.start();
		t3.start();
	}
}
