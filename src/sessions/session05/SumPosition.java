package sessions.session05;

public class SumPosition {
	public static void main(String[] args) {
		System.out.println(findSumPosition(new int[] { 1, 12, 4, 7, 24, 13, 15, 24 }));
	}

	private static int findSumPosition(int[] arr) {
		int suma = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " " + suma + " " + arr[i]);
			if (suma == arr[i]) {
				return i;
			}
			suma += arr[i];
		}
		return -1;
	}
}
