package com.cn.edu.util;

import org.apache.log4j.Logger;

public class TaskTwo {
	protected static final Logger log=Logger.getLogger(TaskTwo.class);
	
	public void doIt(){
		log.info("-----定时任务执行-----");
		System.out.println("--定时任务执行---");
	}
}
