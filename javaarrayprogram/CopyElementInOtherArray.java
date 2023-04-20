package javaarrayprogram;

public class CopyElementInOtherArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr2 = new int[arr.length];
		
		System.out.print("New array: ");
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
			System.out.print(arr2[i] + " ");
		}		
	}
}
