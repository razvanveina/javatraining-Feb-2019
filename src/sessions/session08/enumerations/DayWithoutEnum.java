package sessions.session08.enumerations;

public class DayWithoutEnum {
	public static final int LU = 1;
	public static final int MA = 2;
	public static final int MI = 3;

	public static void main(String[] args) {
		int day = MI;

		switch (day) {
		case LU:
			System.out.println("Luni");
			break;
		case MA:
			System.out.println("Martis");
			break;
		}
	}
}
