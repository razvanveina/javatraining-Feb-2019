package sessions.session06;

public class TestEA2 {
	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}

	private static int reverse(int n) {
		int result = 0;

		while (n > 0) {
			int cifra = n % 10;
			result = result * 10 + cifra;
			n /= 10;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(12345));
	}
}
