package com.bingoabin.thread;

/**
 * @author bingoabin
 * @date 2022/4/14 21:46
 */
public class Consumer implements Runnable{
	private Bread bread;

	public Consumer(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bread.consumerBread();
		}
	}
}
