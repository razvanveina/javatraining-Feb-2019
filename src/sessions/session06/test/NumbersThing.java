package sessions.session06.test;

public class NumbersThing {
	public static void main(String[] args) {
		int x = 7;
		// wrapper
		Integer x1 = 7;
		x1 = null;
		// x = null;
		int[] arr;

		int x2 = Integer.parseInt("123");
		int x3 = Integer.parseInt("123q");

		Boolean b;
		Double d;
		Float f;
		Character ch;

		// autoboxing
		int a = 7;
		Integer a2 = a; // new Integer(a)

		// unboxing
		Integer aa = 7;
		int aa2 = aa; // Integer.valueOf()

	}
}
