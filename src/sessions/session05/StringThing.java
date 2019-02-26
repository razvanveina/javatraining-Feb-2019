package sessions.session05;

import java.util.Arrays;
import java.util.Scanner;

public class StringThing {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "ab" + "c";
		// s3 = "abcd";

		Scanner sc = new Scanner(System.in);
		// s3 = sc.nextLine();
		// IMUTABIL
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		sc.close();

		String s = "abc";
		System.out.println(s.charAt(0));
		System.out.println(s.compareTo("aac"));
		System.out.println(s.compareToIgnoreCase("Abc"));
		System.out.println(s.compareTo("bac"));
		System.out.println(s.compareTo("abc"));

		System.out.println(s.contains("bc"));
		System.out.println(s.endsWith("bc"));
		System.out.println(s.equals("abc"));
		System.out.println(s.equalsIgnoreCase("Abc"));

		System.out.println(s.indexOf('b'));
		System.out.println("abc".indexOf('b'));
		System.out.println("abc".indexOf('d'));
		System.out.println("abc".indexOf("bc"));
		System.out.println("abcabc".indexOf("bc", 3));

		System.out.println("abc".isEmpty());
		System.out.println("abca".lastIndexOf('a'));
		System.out.println("abc".length());
		System.out.println("abc".replace('a', 'd'));
		System.out.println("abc".replace("ab", "AB"));
		System.out.println("abcabc".replaceAll("ab", "AB"));

		System.out.println("abcabc".startsWith("ab"));
		System.out.println("abcabc".substring(2));
		System.out.println("abcabc".substring(2, 4));
		System.out.println("abcabc".toCharArray());
		System.out.println("  abcabc\n\n\n  ".trim());
		System.out.println("  abcabc  ");

		s = "abc";
		s.replace('a', 'd');
		System.out.println(s);
		String[] splits = "123.2314,234;1234,1234".split("[.,;]+");
		System.out.println(Arrays.toString(splits));
	}

	public static int x() {
		return 0;
	}
}
