package sessions.session09;

import java.util.Arrays;

public class TestEA18 {
	public static int countSums(int[] arr) {
		Arrays.parallelSort(arr);
		int counter = 0;
		int firstElement = -1;

		for (int i = 0; i < arr.length; i++) {
			if (firstElement != arr[i]) {
				int[] restArray = removeElementAtPos(arr, i);
				counter += countPairs(restArray, arr[i]);
				firstElement = arr[i];
			}
		}

		return counter;
	}

	private static int countPairs(int[] arr, int sum) {
		int counter = 0;
		int firstElement = -1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum && //
						firstElement != arr[i]) {
					firstElement = arr[i];
					counter++;
				}
			}
		}
		return counter;
	}

	private static int[] removeElementAtPos(int[] arr, int pos) {
		int[] result = new int[arr.length - 1];
		int resultIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (pos != i) {
				result[resultIndex] = arr[i];
				resultIndex++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			countSums(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4 });
		}
		long stop = System.currentTimeMillis();
		System.out.println("Time: " + (stop - start));
	}
}
