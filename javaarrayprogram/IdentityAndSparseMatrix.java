package javaarrayprogram;

public class IdentityAndSparseMatrix {

	// Identity matrix check method
	public static void isIndentityMatrix(int[][] a) {
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j && a[i][j] != 1) {
					flag = false;
					break;
				}
				if (i != j && a[i][j] != 0) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("It is identity matrix");
		} else {
			System.out.println("It is not identity matrix");
		}
	}

	// Sparse matrix check method -- 0 should be more than number
	public static void isSparseMatrix(int[][] a) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					count++;
				}

			}
		}
		int rows = a.length;
		int columns = a[0].length;
		int size = rows * columns;
		if (count > size / 2) {
			System.out.println("It is sparse matrix");
		} else {
			System.out.println("It is not a sparse matrix");
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][] arr2 = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
		int[][] arr3 = { { 1, 1, 1 }, { 0, 7, 5 }, { 0, 0, 1 } };

		isIndentityMatrix(arr);
		isIndentityMatrix(arr2);

		isSparseMatrix(arr);
		isSparseMatrix(arr2);
		isSparseMatrix(arr3);

	}

}
