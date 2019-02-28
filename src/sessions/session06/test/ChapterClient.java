package sessions.session06.test;

public class ChapterClient {
	public static void main(String[] args) {
		ChapterClient cc = new ChapterClient();
		cc.run();
	}

	private void run() {
		Chapter cuprins = new Chapter("Cuprins");
		Chapter intro = new Chapter("Introducere");
		Chapter var = new Chapter("Variabile");
		Chapter varLoc = new Chapter("Variabile locale");
		Chapter varMembru = new Chapter("Variabile membru");
		Chapter clase = new Chapter("Clase");

		cuprins.setChildren(new Chapter[] { intro, clase });
		intro.setChildren(new Chapter[] { var });
		var.setChildren(new Chapter[] { varLoc, varMembru });

		cuprins.display("");
	}
}
