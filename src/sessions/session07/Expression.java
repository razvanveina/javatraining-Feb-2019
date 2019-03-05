package sessions.session07;

public class Expression {
	public static void main(String[] args) {
//		System.out.println(evaluate(expression));
//		System.out.println(expression.contains("+"));
//		int indexOfPlus = expression.indexOf("+");
//		System.out.println(indexOfPlus);
//		System.out.println(expression.substring(0, indexOfPlus));
//
//		String leftSide = expression.substring(0, indexOfPlus);
//		String rightSide = expression.substring(indexOfPlus + 1);
//		System.out.println(leftSide);
//		System.out.println(rightSide);
//		Integer.parseInt("3");
		String expression = "100/5/2-1-1-1";
		System.out.println(evaluate(expression));
	}

	private static int evaluate(String exp) {
		if (exp.contains("+")) {
			int index = exp.lastIndexOf("+");
			String leftSide = exp.substring(0, index);
			String rightSide = exp.substring(index + 1);
			return evaluate(leftSide) + evaluate(rightSide);
		}
		if (exp.contains("-")) {
			int index = exp.lastIndexOf("-");
			String leftSide = exp.substring(0, index);
			String rightSide = exp.substring(index + 1);
			return evaluate(leftSide) - evaluate(rightSide);
		}
		if (exp.contains("*")) {
			int index = exp.lastIndexOf("*");
			String leftSide = exp.substring(0, index);
			String rightSide = exp.substring(index + 1);
			return evaluate(leftSide) * evaluate(rightSide);
		}
		if (exp.contains("/")) {
			int index = exp.lastIndexOf("/");
			String leftSide = exp.substring(0, index);
			String rightSide = exp.substring(index + 1);
			return evaluate(leftSide) / evaluate(rightSide);
		}
		return Integer.parseInt(exp);
	}
}
