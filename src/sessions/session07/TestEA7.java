package sessions.session07;

public class TestEA7 {
	public static int nthSmallest(int[] sir, int n) {
		for (int element : sir) {
			int counter = 0;
			for (int element2 : sir) {
				if (element2 < element) {
					counter++;
				}
			}
			if (counter == n - 1) {
				return element;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(nthSmallest(new int[] { 5, 1, 4, 9, 6 }, 1));
		System.out.println(nthSmallest(new int[] { 5, 1, 4, 9, 6 }, 2));
		System.out.println(nthSmallest(new int[] { 5, 1, 4, 9, 6 }, 3));
		System.out.println(nthSmallest(new int[] { 5, 1, 4, 9, 6 }, 4));
		System.out.println(nthSmallest(new int[] { 5, 1, 4, 9, 6 }, 5));
	}
}
