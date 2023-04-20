package javaarrayprogram;

public class RotateElement {

	public static void main(String[] args) {

		// left rotation
		int[] arr = { 10, 20, 30, 40, 50 };

		// outer loop to rotate element -- here we are rotating 3 times
		for (int i = 0; i < arr.length - 2; i++) {
			int temp;
			temp = arr[0];
			// inner loop to rotate all element 1 position ahead
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		int[] arr2 = { 10, 20, 30, 40, 50 };

		// right rotation
		for (int i = 0; i < arr2.length - 2; i++) {
			int temp;
			temp = arr2[arr2.length - 1];
			// inner loop to rotate all element 1 position behind
			for (int j = arr2.length - 2; j >= 0; j--) {
				arr2[j + 1] = arr2[j];
			}
			arr2[0] = temp;

		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
