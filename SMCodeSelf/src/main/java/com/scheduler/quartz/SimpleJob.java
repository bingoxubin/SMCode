package com.scheduler.quartz;

/**
 * @author bingoabin
 * @date 2023/3/23 18:47
 * @Description:
 */
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Hello, Quartz! This is a simple job.");
	}
}
