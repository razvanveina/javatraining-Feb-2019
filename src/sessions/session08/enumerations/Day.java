package sessions.session08.enumerations;

public enum Day {
	LU("Luni"), MA("Marti"), MI("Miercuri"), JO("Joi");

	private String text;

	Day(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
