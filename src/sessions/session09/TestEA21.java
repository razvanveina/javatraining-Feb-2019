package sessions.session09;

public class TestEA21 {
	public static String hangman(String word, String letters) {
		String result = "";

		for (int i = 0; i < word.length(); i++) {
			char ch = word.toLowerCase().charAt(i);
			if (ch != ' ' && (ch < 'a' || ch > 'z')) {
				return null;
			}

			if (ch == ' ') {
				result += ch;
			} else {
				boolean charFound = letters.toLowerCase().indexOf(Character.toLowerCase(ch)) != -1;
				result += (charFound ? word.charAt(i) : "_");
			}
		}

		return result;
	}
}
