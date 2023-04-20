package javaarrayprogram;

public class AdditionOfTwoMatrix {

	public static int[][] addition(int[][] x, int[][] y) {
		int[][] z = new int[2][3];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y[0].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return z;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] finalArray = addition(a, b);

		for (int[] i : finalArray) {
			for (int j : i) {
				System.out.println(j);
			}

		}
	}

}
