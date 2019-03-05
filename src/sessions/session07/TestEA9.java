package sessions.session07;

public class TestEA9 {
	public static int countPairs(int[] arr, int n) {
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					counter++;
				}
			}
		}

		return counter;
	}
}
