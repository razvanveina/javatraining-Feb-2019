package sessions.session02;

public class PrimitivesThing {
	public static void main(String[] args) {
		byte b = 100;
		System.out.println(b);
		byte b2 = (byte) 200000; // cast

		int n = (int) 13.7;

		System.out.println(b2);
		System.out.println(n);

		char ch = 'A';
		ch++;
		System.out.println(ch);
		int n2 = ch;
		System.out.println(n2);

		char ch2 = '\\';
		System.out.println(ch2);
		ch2 = '\'';
		System.out.println(ch2);
		System.out.println("\n\r");
		ch2 = '\"';
		System.out.println(ch2);

		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
	}
}
