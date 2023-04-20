package javabasicprogram;

public class JavaPattern {

	public static void main(String[] args) {

		// right triangle star pattern -- with space
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// right triangle star pattern -- without space
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// right reverse triangle -- with space
		for (int i = 0; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// right reverse triangle -- without space
		for (int i = 0; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// left triangle star pattern -- with space
		// outer loop for number of rows
		for (int i = 0; i < 6; i++) {

			for (int j = 2 * (5 - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// left triangle star pattern -- without space
		// outer loop for number of rows
		for (int i = 0; i < 6; i++) {

			// first inner loop for space
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			// second inner loop for stars
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// left reverse pyramid -- with space
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// left reverse pyramid -- without space
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// pyramid star pattern -- with space
		for (int i = 0; i < 6; i++) {

			// first inner loop for space
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			// second inner loop for stars
			for (int l = 0; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		// pyramid star pattern -- without space
		for (int i = 0; i < 6; i++) {

			// first inner loop for space
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			// second inner loop for stars
			for (int l = 0; l <= i * 2; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// diamond shape -- without space
		// upper half -- can be use as above -- below is the another technique
		for (int i = 0; i < 6; i++) {

			// first inner loop for space
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			// second inner loop for stars
			for (int l = 0; l <= i * 2; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// lower half
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2 * (5 - i) - 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// diamond shape -- with space
		// upper part
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// lower part
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// sand glass star pattern -- with space
		// upper part
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 6; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// lower part
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
