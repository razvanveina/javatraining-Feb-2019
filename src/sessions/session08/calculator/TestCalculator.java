package sessions.session08.calculator;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc2 = new Calculator();
		Calculator calc = new Calculator();
		calc.doOperation("+5");
		double result = calc.doOperation("-7");
		System.out.println(result);
	}
}
