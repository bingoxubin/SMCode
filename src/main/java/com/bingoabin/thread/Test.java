package com.bingoabin.thread;

/**
 * @author bingoabin
 * @date 2022/4/14 21:47
 */
public class Test {
	public static void main(String[] args){
		Bread bread = new Bread(0);
		Consumer consumer = new Consumer(bread);
		Producer producer = new Producer(bread);

		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);

		thread1.start();
		thread2.start();
	}
}
