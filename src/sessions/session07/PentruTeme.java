package sessions.session07;

public class PentruTeme {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			// timpul curent
			System.out.println(System.currentTimeMillis());
			// System.out.println(i);
			// pauza de o secunda in program
			Thread.sleep(1000);
		}
	}
}
