package javabasicprogram;

import java.util.Random;

public class RandomNumberRandom {

	public static void main(String[] args) {
		Random r = new Random();

		// nextInt()
		int number = r.nextInt(100); // 100 is the upper limit here
		System.out.println(number);
		int number2 = r.nextInt(); // we can generate upper without upper limit -- it will generate any +ve or -ve
									// number
		System.out.println(number2);

		// nextBoolean()
		boolean bool = r.nextBoolean();
		System.out.println(bool);

		// nextDouble() -- 0.0 to 1.0
		double db = r.nextDouble();
		System.out.println(db);

		// nextFloat() -- 0.0 to 1.0
		Float f = r.nextFloat();
		System.out.println(f);

		// nextLong() -- any +ve or -ve long number
		Long l = r.nextLong();
		System.out.println(l);
	}

}
