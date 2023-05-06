package com.bingoabin.thread;

/**
 * @author bingoabin
 * @date 2022/4/14 21:41
 */
public class Bread {
	private int num;

	public Bread(int num) {
		this.num = num;
	}

	public synchronized void produceBread() {
		if (num < 20) {
			num++;
			System.out.println("生产了一个，还剩下：" + num);
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void consumerBread() {
		if (num > 0) {
			num--;
			System.out.println("消费了一个，还剩下：" + num);
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
