package sessions.session05;

public class TestBA9 {
	public static int getDiagonalSum(int[][] matrix) {

		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}

		return sum;

	}
}
