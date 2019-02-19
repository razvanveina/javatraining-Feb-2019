package sessions.session04;

public class ObjectsThing {
	private static final int NR = 100000000;

	public static void main(String[] args) {
		String s = new String("abc");
		String s2 = null;

		for (int i = 0; i < 5; i++) {
			String s1 = Integer.toString(i);
			s2 = s1;
		}

		MyClass myClass = new MyClass("XXX");
		String[] data = myClass.data;
		myClass = null;

		// ???
		MyClass[] arr = new MyClass[NR];
		String ss = "";
		for (int i = 0; i < NR; i++) {
			ss += i;
			arr[i] = new MyClass(ss);
		}

	}
}

// 105
class MyClass {
	String[] data = new String[5];
	String s;

	public MyClass(String s) {
		this.s = s;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Am sters obiectul " + s);
	}

	public int x(int n) {
		if (n > 0) {
			return 1;
		}
		return 2;
	}

	public String metodaCareReturneazaOReferinta() {
		return new String();
	}
}
