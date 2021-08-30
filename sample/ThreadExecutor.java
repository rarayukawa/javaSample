package sample;

public class ThreadExecutor {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			RunnableSample r = new RunnableSample();
			Thread[] threads = new Thread[10];
			
			for (int j = 0; j < threads.length; j++) {
				threads[j] = new Thread(r);
			}
			
			for(int j = 0; j < threads.length; j++) {
				threads[j].start();
			}
			
			for (int j = 0; j < threads.length; j++) {
				try {
					threads[j].join();
				} catch (InterruptedException e) {
				}
			}
			
			System.out.println((i + 1) + "回目：処理結果は" + r.getCount() + "です");
		}
	}
}
