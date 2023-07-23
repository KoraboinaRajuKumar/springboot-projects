package com.infy;

public class SingletonClaz {

	public static SingletonClaz s = null;

	private SingletonClaz() {

	}

	public static SingletonClaz getSingleTon() {

		if (s == null) {
			s = new SingletonClaz();

		}
		return s;
	}

	public static void main(String[] args) {
		SingletonClaz singleTon = SingletonClaz.getSingleTon();
		System.out.println(singleTon);
		SingletonClaz singleTon1 = SingletonClaz.getSingleTon();
		System.out.println(singleTon1);

	}

}
