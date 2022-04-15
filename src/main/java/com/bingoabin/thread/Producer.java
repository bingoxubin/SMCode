package com.bingoabin.thread;

/**
 * @author bingoabin
 * @date 2022/4/14 21:44
 */
public class Producer implements Runnable{
	private Bread bread;

	public Producer(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bread.produceBread();
		}
	}
}
