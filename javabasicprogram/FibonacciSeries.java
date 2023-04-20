package javabasicprogram;

public class FibonacciSeries {

	static int i, n1 = 0, n2 = 1, n3 = 0;
	static int count = 10;

	public static void main(String[] args) {
		// using for loop
		System.out.print("Fibonacci series is :" + n1 + " " + n2);

		for (i = 0; i < count; i++) {
			n3 = n1 + n2;

			System.out.print(" " + n3);

			n1 = n2;
			n2 = n3;
		}

	}

}
