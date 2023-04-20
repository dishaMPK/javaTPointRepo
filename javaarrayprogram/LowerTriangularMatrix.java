package javaarrayprogram;

public class LowerTriangularMatrix {

	public static int[][] makeLowerTriangularMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j > i) {
					a[i][j] = 0;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };

		int[][] arrNew = makeLowerTriangularMatrix(arr);

		for (int[] i : arrNew) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
