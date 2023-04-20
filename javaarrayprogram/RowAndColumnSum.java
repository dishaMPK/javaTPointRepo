package javaarrayprogram;

public class RowAndColumnSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			int columnSum = 0;
			for (int j = 0; j < arr.length; j++) {
				rowSum += arr[i][j];
				columnSum += arr[j][i];
			}
			System.out.println( i+1 + " Row sum is " + rowSum);
			
			System.out.println( i+1 + " Column sum is " + columnSum);
			
		}
	}

}
