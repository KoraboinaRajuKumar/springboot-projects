package com.infy;

public class ImplApproch {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Second approach...");

			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
