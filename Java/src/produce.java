package src;

import java.util.LinkedList;
import java.util.List;

public class produce implements Runnable {

	public List<Integer> sharedQueue;

	public produce() {
		sharedQueue = new LinkedList<Integer>();

	}

	@Override
	public void run() {

		producer();

	}

	public boolean producer() {

		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				sharedQueue.add(i);
				System.out.println(i + " : item produced");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println("\nProduction complete");
			this.notify();
		}
		return true;
	}

}
