package com.infy;

public class ExtendsApproach {
	
	
	public static void main(String[] args) {
		
		Thread  thread =new Thread() {
			@Override
			public void run() {
				System.out.println("Run methods called..");
				
			}
		};
		thread.start();
		//sthread.start();
	}

	/*
	 * @Override public void run() {
	 * 
	 * System.out.println("Inside run() methods is called...!");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { ExtendsApproach approach = new
	 * ExtendsApproach(); Thread thread = new Thread(approach); thread.start(); }
	 */
}
