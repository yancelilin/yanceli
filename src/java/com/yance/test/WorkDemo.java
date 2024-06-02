package com.yance.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorkDemo {

	private Logger logger = LogManager.getLogger("testlog");  
	
	
	public void workWriteLog() {
		
		logger.info("work demo working now!");
		logger.info("1");
		logger.info("2");
		logger.info("3");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("4");
		logger.info("5");
		logger.info("6");
		logger.info("work demo working over!");
		System.out.println("work demo working over!");
	}
	
	

	
}
