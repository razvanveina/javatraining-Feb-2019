package sessions.session04;

public class GC {
	public static void main(String[] args) {
		String s1 = "abc"; // new String("abc")
		String s3 = method();
		s1 = s3;
		for (int i = 0; i < 10; i++) {
			String s4 = "" + i;
			System.out.println(s4);
		}
		s3 = null;
	}

	private static String method() {
		String s2 = "x";
		s2 = "y";
		return s2;
	}
}