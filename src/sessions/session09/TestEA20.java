package sessions.session09;

public class TestEA20 {
	public static boolean sudokuChecker(int[][] matrix) {
		if (matrix.length != 3) {
			return false;
		}

		for (int i = 0; i < 3; i++) {
			if (matrix[i].length != 3) {
				return false;
			}
		}

		int[] arr = new int[9];
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] > 9 || matrix[i][j] < 0) {
					return false;
				}
				arr[counter++] = matrix[i][j];
			}
		}

		return isSudokuLine(arr);

	}

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
