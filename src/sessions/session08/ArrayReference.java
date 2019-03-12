package sessions.session08;

import java.util.Arrays;

public class ArrayReference {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 3, 4, 2 };
		metoda(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void metoda(int[] arr) {
		arr[0] = 0;
	}
}
