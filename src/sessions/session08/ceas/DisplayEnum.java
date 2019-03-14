package sessions.session08.ceas;

public class DisplayEnum {
	public void show(String text) {
		for (int row = 0; row < Digit.DIGIT_0.getData().length; row++) {
			for (int col = 0; col < text.length(); col++) {
				char ch = text.charAt(col);
				Digit digit = Digit.getDigitByChar(ch);
				System.out.print(digit.getSlice(row));
			}
			System.out.println();
		}
	}

}
