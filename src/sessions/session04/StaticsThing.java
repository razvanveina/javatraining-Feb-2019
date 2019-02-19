package sessions.session04;

public class StaticsThing {
	public static int variabilaStatica = 10;
	public int variabilaNestatica = 6;

	public static void main(String[] args) {
		System.out.println(variabilaStatica);
		// System.out.println(variabilaNestatica);

		StaticsThing obj1 = new StaticsThing();
		System.out.println(obj1.variabilaNestatica);

		StaticsThing obj2 = new StaticsThing();
		System.out.println(obj2.variabilaNestatica);

		StaticsThing.variabilaStatica++;
		System.out.println(StaticsThing.variabilaStatica);

		GC.main(args);
	}

	public void method() {
		System.out.println(variabilaNestatica);
		System.out.println(variabilaStatica);
	}
}
