package sessions.session08;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.doOperation("+5");
		double result = calc.doOperation("-7");
		System.out.println(result);
	}
}
