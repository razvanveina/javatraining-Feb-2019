package sessions.session08.ceas;

public enum Digit {
	DIGIT_0('0', new String[] { //
			" __ ", //
			"|  |", //
			"|__|" //
	}), //
	DIGIT_1('1', new String[] { //
			"    ", //
			"  /|", //
			"   |" //
	}), //
	DIGIT_2('2', new String[] { //
			" __ ", //
			" __|", //
			"|__ " //
	}), //
	DIGIT_3('3', new String[] { //
			" __ ", //
			" __|", //
			" __|" //
	}), //
	DIGIT_DOT('.', new String[] { //
			"   ", //
			"   ", //
			" o " //
	}), //
	DIGIT_COL(':', new String[] { //
			"   ", //
			" o ", //
			" o " //
	});

	private char ch;
	private String[] data;

	Digit(char ch, String[] data) {
		this.ch = ch;
		this.data = data;
	}

	public String[] getData() {
		return data;
	}

	public static Digit getDigitByChar(char ch) {
		for (Digit digit : Digit.values()) {
			if (digit.ch == ch) {
				return digit;
			}
		}
		return null;
	}

	public String getSlice(int row) {
		return data[row];
	}
}
