package com.threadlocal;

/**
 * @author bingoabin
 * @date 2023/3/23 16:28
 * @Description:
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncThreadPoolExample {

	public static void main(String[] args) {
		// 创建一个线程池
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// 创建一个异步任务
		Runnable asyncTask = () -> {
			try {
				System.out.println("异步任务开始执行...");
				Thread.sleep(2000); // 模拟耗时操作
				System.out.println("异步任务执行完毕...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		// 将任务提交给线程池并执行
		Future<?> future = executorService.submit(asyncTask);

		// 主线程继续执行其他任务
		try {
			System.out.println("主线程正在执行其他任务...");
			Thread.sleep(1000); // 模拟主线程的耗时操作
			System.out.println("主线程任务执行完毕...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 关闭线程池
		executorService.shutdown();
	}
}

