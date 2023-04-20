package javabasicprogram;

public class FactorialProgram2 {
	
	static int number = 5;
	static int factorial = 1;
	
	public static int factorialMethod() {
		for(int i = number; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		
		System.out.println(factorialMethod());

	}

}
