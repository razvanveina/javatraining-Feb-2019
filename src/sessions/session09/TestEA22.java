package sessions.session09;

public class TestEA22 {
	public static int stringSum(String input) {
		if (input.trim().length() == 0) {
			return 0;
		}
		String[] splits = input.split(",");

		int sum = 0;

		for (String s : splits) {
			int nr = Integer.parseInt(s.trim());
			sum += nr;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(stringSum("14, 5, 2, 1 , 6"));
		System.out.println(stringSum(" "));
	}
}
