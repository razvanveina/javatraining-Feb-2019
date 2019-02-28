package sessions.session06;

public class TestEA4 {
	public static int cmmmc(int a, int b) {
		int max = Integer.max(a, b);

		for (int i = max; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}

		return -1;
	}

	public static int cmmmc2(int a, int b) {
		int i = Integer.max(a, b);

		while (true) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(cmmmc(4, 6));
	}
}
