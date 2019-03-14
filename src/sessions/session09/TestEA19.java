package sessions.session09;

public class TestEA19 {
	public static boolean isSudokuLine(int[] arr) {
		if (arr.length != 9) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != 0) {
					return false;
				}
			}
		}

		return true;
	}
}
