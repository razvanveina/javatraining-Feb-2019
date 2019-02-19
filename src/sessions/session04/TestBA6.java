package sessions.session04;

public class TestBA6 {
	public static int arrayToInt(int[] arr) {
		int nr = 0;
		for (int element : arr) {
			nr *= 10;
			nr += element;
		}
		return nr;
	}

	public static void main(String[] args) {
		System.out.println(arrayToInt(new int[] { 1, 2, 3, 4 }));
	}
}
