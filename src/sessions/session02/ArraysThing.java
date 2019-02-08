package sessions.session02;

import java.util.Arrays;

public class ArraysThing {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[2] = 7;
		arr[4] = 7;
		// arr = null;
		// arr[5] = 7; ArrayIndexOutOfBounds
		System.out.println(arr.length);
		System.out.println(arr[0]);
		int n = arr[1];

		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr2));

		int[][] matrix = { //
				{ 1, 2, 3 }, //
				{ 4, 5, 6, 1 }, //
				{ 7, 8, 91, 1, 100 } //
		};

		System.out.println(matrix[0][0]);
		System.out.println(matrix[1][0]);
		System.out.println(matrix[0][1]);
		System.out.println(matrix[2][2]);
		System.out.println(matrix[2][4]);

	}
}
