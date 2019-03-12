package sessions.session08.enumerations;

public class DayClient {
	public static void main(String[] args) {
		Day day = Day.LU;
		System.out.println(day.getText());

		switch (day) {
		case LU:
			System.out.println("It's monday");
			break;
		case MA:
			System.out.println("It's tuesday");
			break;
		}

		Day[] values = Day.values();

		for (Day d : values) {
			System.out.println(d);
		}

		Day d2 = Day.valueOf("MA");
		System.out.println(d2.getText());

		System.out.println(d2.compareTo(Day.MA));
		System.out.println(d2.compareTo(Day.LU));
		System.out.println(d2.compareTo(Day.MI));

		System.out.println(d2.equals(Day.MA));

		System.out.println(d2.name());

		System.out.println(Day.JO.ordinal());
		System.out.println(Day.LU.ordinal());

		System.out.println(Day.MA.toString());

		method(100);
		method(Day.LU);

		Status active = Status.ACTIVE;
	}

	public static void method(Day day) {

	}

	public static void method(int day) {

	}
}
