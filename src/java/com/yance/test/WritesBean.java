package com.yance.test;

public class WritesBean {

	public static void main(String[] args) throws Exception {
		
		WorkDemo  demo = new WorkDemo();
		
		
		for(int i=0; i<500; i++ ) {
			Thread.sleep(1000);
			demo.workWriteLog();
		}
	}
}
