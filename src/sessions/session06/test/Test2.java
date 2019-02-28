package sessions.session06.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti o expresie: ");
		String s = scanner.nextLine();
		System.out.println(s);
		System.out.println(s.charAt(1));

		char operator = s.charAt(1);
		String operand1 = "" + s.charAt(0);
		String operand2 = "" + s.charAt(2);

		// Integer.parseInt("" + ch);
		// if (ch == '+')

		scanner.close();
	}
}
