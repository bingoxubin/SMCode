package com.scheduler.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * @author bingoabin
 * @date 2023/3/23 23:53
 * @Description:
 */
public class TimerTest {
	public static void main(String[] args){
		TimerTask task1 = new TimerTask() {
			@Override
			public void run() {
				try {
					System.out.println("task1");
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		TimerTask task2 = new TimerTask() {
			@Override
			public void run() {
				try {
					System.out.println("task2");
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Timer timer = new Timer();
		timer.schedule(task1,0,1000);
		timer.schedule(task2,0,1000);
	}
}
