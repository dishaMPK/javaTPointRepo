package javaarrayprogram;

public class AscendingAndDscendingOrder {

	public static void main(String[] args) {
		
		// ascending order
		int[] arr = { 50, 700, 1050, 200, 10 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// descending order
		int[] arr2 = { 50, 700, 1050, 200, 10 };
		int temp2 = 0;

		for(int i = 0; i < arr2.length; i++) {
			for(int j = i+1; j < arr2.length; j++) {
				if(arr2[i] < arr2[j]) {
					temp2 = arr2[j];
					arr2[j] = arr2[i];
					arr2[i] = temp2;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
