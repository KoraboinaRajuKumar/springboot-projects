package com.infy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableApproach {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			executorService.submit(new Callable<Object>() {
				@Override
				public Object call() throws Exception {
					System.out.println(Thread.currentThread().getName());
					return null;
				}
			});

		}

	}

	/*
	 * @Override public Object call() throws Exception {
	 * System.out.println(Thread.currentThread().getName()); return null; }
	 * 
	 * public static void main(String[] args) { ExecutorService executorService =
	 * Executors.newFixedThreadPool(5);
	 * 
	 * // CallableApproach approach = new CallableApproach();
	 * 
	 * for (int i = 0; i < 10; i++) { executorService.submit(new
	 * CallableApproach()); // Future<Object> submit =
	 * executorService.submit(approach);
	 * 
	 * // System.out.println(submit);
	 * 
	 * // executorService.submit(new CallableApproach()); } }
	 */
}
