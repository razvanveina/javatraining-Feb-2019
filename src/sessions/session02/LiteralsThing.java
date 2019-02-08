package sessions.session02;

public class LiteralsThing {
	public static void main(String[] args) {
		int n = 1000;
		n = 0xFFFF;
		n = 0b01110110;
		long l = 10_000_000_000L;

		double dbl = 3.14D;
		float f = 3.14F;

		System.out.println(l);
		System.out.println("\u0035");
		String s = null;
		// System.out.println(s.length());
	}
}
