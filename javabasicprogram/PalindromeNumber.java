package javabasicprogram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 34543;
		int original = number;
		int reverse = 0;
		
		while(number != 0) {
			int remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number /10;
		}
		
		if(original == reverse) {
			System.out.println(original + " is palindrome number");
		} else {
			System.out.println(original + " is not palindrome number");
		}
		

	}

}
