package sessions.session07;

public class Permutations {
	public static void main(String[] args) {
		permutations("", "abc");
	}

	private static void permutations(String p, String s) {
		if (s.length() == 1) {
			System.out.println(p + s);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String before = s.substring(0, i);
			String after = s.substring(i + 1, s.length());
			permutations("" + p + ch, before + after);
		}
	}
}
