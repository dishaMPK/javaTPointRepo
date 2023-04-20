package javabasicprogram;

public class PalindromeString {

	public static void main(String[] args) {
		String sentence = "This is Disha ahsiD si sihT";
		String original = sentence;
		String reverse = "";
		int length = original.length();
		
			for(int i = length; i > 0; i-- ) {
				reverse = reverse + original.charAt(i-1);
			}
			
			if(original.equals(reverse)) {
				System.out.println("Palindrome present");
			} else {
				System.out.println("Palindrome not present");
			}
		
		
	}

}
