package sessions.session08.calculator;

import java.util.Scanner;

import sessions.session08.ceas.DisplayEnum;

public class MiniCalc2 {
	private Calculator calculator = new Calculator();
	private DisplayEnum display = new DisplayEnum();

	public static void main(String[] args) {
		MiniCalc2 mc = new MiniCalc2();
		mc.run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);

		double start = 0.0;
		System.out.println(start);
		while (true) {
			System.out.print('>');
			String operation = scanner.nextLine();

			// "x".equals(operation)
			if ("x".equals(operation)) {
				break;
			}
			double result = calculator.doOperation(operation);
			System.out.println(result);
			display.show("" + result);

		}
		scanner.close();
	}
}
