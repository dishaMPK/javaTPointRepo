package javaarrayprogram;

public class TransposeMatrix {
	
	public static void transpose(int[][] x) {
		int[][] transformedArray = new int[x.length][x[0].length];
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				transformedArray[i][j] = x[j][i];
			}
		}
		
		for(int i = 0; i < transformedArray.length; i++) {
			for(int j = 0; j < transformedArray[i].length; j++) {
				System.out.print(transformedArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int original[][]={{1,3,4},{2,4,3},{3,4,5}}; 
		transpose(original);

	}

}
