package sessions.session03;

public class ExpressionsThing {
	public static void main(String[] args) {
		int n = 5;
		boolean expression = (n == 5 && methodCall(n));
		n++;

		if (expression == false) {
			int x = 7;
			System.out.println("in");
			System.out.println(x);
		}

		methodCall(3);
		int xx = (5 + 4) * 3;
	}

	private static boolean methodCall(int n) {
		return n > 6;
	}
}
