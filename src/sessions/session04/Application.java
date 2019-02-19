package sessions.session04;

public class Application {
	public static final int CONSTANTA = 7;

	{
		System.out.println("Bloc nestatic");
	}

	public Application() {
		System.out.println("Constructor");
	}

	static {
		System.out.println(1);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.showMenu();

		Math.abs(4);
		// showMenu();
	}

	static {
		System.out.println(2);
	}

	private void showMenu() {

	}
}
