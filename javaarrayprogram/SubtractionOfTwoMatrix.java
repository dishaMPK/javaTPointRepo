package javaarrayprogram;

public class SubtractionOfTwoMatrix {

	public static double[][] subtraction(int[][] x, int[][] y) {
		double[][] z = new double[2][3];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y[0].length; j++) {
				z[i][j] = (double)x[i][j] - (double)y[i][j]; // this way we can change value in double from int
			}
		}
		return z;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 5, 7, 0 }, { 2, 8, 1 } };

		double[][] finalArray = subtraction(a, b);

		for (double[] i : finalArray) {
			for (double j : i) {
				System.out.println(j);
			}

		}
	}

}
