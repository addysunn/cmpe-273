package src;

import java.util.LinkedList;
import java.util.List;

public class consume extends Thread {

	public produce p = new produce();

	public consume(produce obj) {
		p = obj;
	}

	public void run() {

		consumer();
	}

	public boolean consumer() {
		synchronized (this.p) {
			System.out.println("Waiting for production to get over");
			try {
				this.p.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int product = this.p.sharedQueue.size();
		for (int i = 0; i < product; i++) {
			System.out.println("product consumed : " + this.p.sharedQueue.remove(0) + "  ");
		}
		return false;
	}
}
