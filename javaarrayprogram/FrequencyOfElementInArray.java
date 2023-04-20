package javaarrayprogram;

public class FrequencyOfElementInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 50, 20, 20, 30 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] + "|" + (count + 1));
		}

	}

}
