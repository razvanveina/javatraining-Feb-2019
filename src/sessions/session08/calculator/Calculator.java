package sessions.session08.calculator;

public class Calculator {
	private double currentValue;

	public double doOperation(String command) {
		char operator = command.charAt(0);

		String ceRamane = command.substring(1);
		double operand = Double.parseDouble(ceRamane);

		switch (operator) {
		case '+':
			currentValue += operand;
			break;
		case '-':
			currentValue -= operand;
			break;
		default:
			System.out.println("Invalid operation.");
		}

		return currentValue;
	}
}
