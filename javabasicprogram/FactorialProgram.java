package javabasicprogram;

public class FactorialProgram {

	public static void main(String[] args) {
		// we are finding 5 factorial
		
		int number = 5;
		int factorial = 1;
		
		for(int i = number; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of 5 is " + factorial);

	}

}
