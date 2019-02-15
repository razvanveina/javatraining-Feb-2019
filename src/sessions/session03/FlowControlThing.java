package sessions.session03;

public class FlowControlThing {
	public static void main(String[] args) {
		int nota = 5;

		if (nota >= 8) {
			System.out.println("Excelent");
		} else if (nota >= 5) {
			System.out.println("Admis");
		} else {
			System.out.println("Respins");
		}

		nota = 10;
		// String d = "";
		switch (nota) {
		case 10:
		case 9:
			System.out.println("Genial");
			break;
		case 8:
		case 7:
			System.out.println("Foarte bine");
			break;
		case 6:
		case 5:
			System.out.println("Bine");
			break;
		case 4:
		case 3:
			System.out.println("Mda...");
			break;
		}

		int counter = 1;
		while (counter < 11) {
			System.out.println(counter);
			counter++;
		}

		counter = 1;
		do {
			System.out.println(counter);
			counter++;
		} while (counter < 11);

		counter = 1;
		while (true) {
			System.out.println(counter);
			counter++;

			if (counter == 11) {
				break;
			}
		}

		counter = 1;
		while (counter < 100000000) {
			counter++;
			if (counter % 10000000 != 0) {
				continue;
			}
			System.out.println(counter);
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		label: for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("" + i + j);
				if (j == 1) {
					break label;
				}
			}
		}

//		for (;;) {
//			
//		}

		metodaMea();
		System.out.println(cauta(new int[] { 6, 4, 8, 5, 2, 1 }, 5));
	}

	// asa nu
	private static boolean cauta(int[] arr, int n) {
		boolean gasit = false;

		for (int element : arr) {
			if (n == element) {
				gasit = true;
			}
		}

		return gasit;
	}

	// asa da
	private static boolean cauta2(int[] arr, int n) {
		for (int element : arr) {
			if (n == element) {
				return true;
			}
		}

		return false;
	}

	private static void metodaMea() {
		int[] arr = { 5, 7, 4, 7, 8, 3, 9 };

		// asa nu
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] == 7) {
				return;
			}
		}

		// asa da
		for (int element : arr) {
			System.out.println(element);
		}
	}

}
