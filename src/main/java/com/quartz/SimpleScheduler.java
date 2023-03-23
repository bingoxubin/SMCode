package com.quartz;

/**
 * @author bingoabin
 * @date 2023/3/23 18:48
 * @Description:
 */
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleScheduler {
	public static void main(String[] args) {
		try {
			// 创建一个Scheduler实例
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

			// 定义一个JobDetail，指定任务的实现类
			JobDetail jobDetail = JobBuilder.newJob(SimpleJob.class)
			                                .withIdentity("simpleJob", "simpleGroup")
			                                .build();

			// 定义一个Trigger，指定任务的调度规则
			Trigger trigger = TriggerBuilder.newTrigger()
			                                .withIdentity("simpleTrigger", "simpleGroup")
			                                .startNow()
			                                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
			                                                                   .withIntervalInSeconds(5) // 每10秒执行一次
			                                                                   .repeatForever()) // 一直重复执行
			                                .build();

			// 将任务和触发器添加到调度器
			scheduler.scheduleJob(jobDetail, trigger);

			// 启动调度器
			scheduler.start();

		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}

