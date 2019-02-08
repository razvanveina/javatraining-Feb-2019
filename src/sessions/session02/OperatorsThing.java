package sessions.session02;

public class OperatorsThing {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(n);
		n++;
		System.out.println(++n);
		System.out.println(n);

		n = 0;
		n = n++ + 5;

		System.out.println(n);

		n = -n;

		System.out.println(10 * 3);
		System.out.println(10 / 3.0);
		System.out.println(10 % 3);

		System.out.println(10 + 3);
		System.out.println(10 - 3);

		System.out.println(10 + 3 * 5 - 7);
		System.out.println((10 + 3) * (5 - 7));

		System.out.println(10 << 2);

		System.out.println(10 >> 2);
		System.out.println(10 >>> 2);
		System.out.println(-10 >> 2);
		System.out.println(-10 >>> 2);

		int n2 = 7;
		System.out.println(n2 > 10);
		System.out.println(n2 <= 10);

		System.out.println(n2 = 10);
		System.out.println(n2 == 10);
		System.out.println(n2 != 10);

		System.out.println(10 & 5);
		System.out.println(10 | 5);
		System.out.println(10 ^ 5);

		System.out.println(n2 > 1 && n2 < 11);
		System.out.println(n2 > 1 || n2 < 11);
		System.out.println(n2 > 1 & n2 < 11);
		System.out.println(n2 > 1 | n2 < 11);

		System.out.println(isNumber(n2) && n2 > 1);

		System.out.println(n2 > 1 && isNumber(n2));

		System.out.println(n2 < 1 && isNumber(n2)); // scurtcircuitare
		System.out.println(n2 < 1 & isNumber(n2));
		System.out.println(n2 > 1 || isNumber(n2)); // scurtcircuitare

		n2 += 1; // n2 = n2 + 1
		n2 += 10; // n2 = n2 + 10

		n2 = 9;
		System.out.println(n2 > 4 ? "Admis" : "Respins");

		System.out.println(n2 > 4 ? (n2 > 8 ? "Foarte bine" : "Decent") : "Respins");

		System.out.println(n2);

	}

	private static boolean isNumber(int n2) {
		System.out.println("Am fost aici");
		return false;
	}
}
