package sessions.session08.ceas;

public class CeasDigital {
	public static void main(String[] args) throws InterruptedException {
		TimeConverter tc = new TimeConverter();
		Display display = new Display();

		while (true) {
			String time = tc.getTimeAsString();
			// System.out.println(time);
			display.show(time);

			Thread.sleep(1000);
		}
	}
}
