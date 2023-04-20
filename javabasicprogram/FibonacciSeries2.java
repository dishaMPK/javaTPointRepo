package javabasicprogram;

public class FibonacciSeries2 {
	
	static int i;
	static int n1 = 0, n2= 1, n3 = 0;
	static int count = 10;
	
	public static void fibonacciSeriesMethod(int j) {
		i = j;
		
		if (i < count) {
			n3 = n1 + n2;

			System.out.print(" " + n3);

			n1 = n2;
			n2 = n3;
			fibonacciSeriesMethod(i + 1);
		}
	}

	public static void main(String[] args) {
		// using if condition
		System.out.print("Fibonacci series is :" + n1 + " " + n2);
		fibonacciSeriesMethod(0);
	}

}
