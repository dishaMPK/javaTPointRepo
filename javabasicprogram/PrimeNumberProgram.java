package javabasicprogram;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		// Prime number can be divided by number itself or 1 -- number should be greater than 1

		int numMinimum = 10;
		int numMaximum = 100;

		System.out.print("Prime numbers are:");

		for (int i = numMinimum; i <= numMaximum; i++) {
			Boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag && i > 1) {
				System.out.print(" " + i);
			}
		}

	}

}
