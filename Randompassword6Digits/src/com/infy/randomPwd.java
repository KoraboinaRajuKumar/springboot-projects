package com.infy;

import java.util.Random;

public class randomPwd {

	public static String randompwd() {

		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrsuvwxyz";

		StringBuilder sb = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < 6; i++) {

			int index = random.nextInt(text.length());
			sb.append(text.charAt(index));

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(randompwd());

		System.out.println(randompwd());
		System.out.println(randompwd());

	}

}
