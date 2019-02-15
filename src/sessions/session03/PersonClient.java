package sessions.session03;

import java.util.Arrays;

public class PersonClient {
	public static void main(String[] args) {
		// declaratia variabilei
		Person person;

		// initializarea variabilei
		person = new Person("Ion", null, 90);

		// asa da
		Person p1 = new Person();
		p1.setCnp("0123"); // new String("123")
		p1.setAge(8);

		person.setName("Ion");

		p1 = person;
		p1.setName("Gheo");
		System.out.println(person.getName());
		System.out.println(1);

		p1.showInfo();

		p1.doSomething();
		p1.doSomething(1);
		p1.doSomething("3");

		// pasarea parametrilor
		int x = 10;
		p1.testParameters(x);
		System.out.println(x);

		Person p = new Person("1", "1", 1);
		p1.testParameters(p);
		System.out.println(p.getName());

		p1.variableParameters(123);
		p1.variableParameters(123, 3425);
		p1.variableParameters();

		int[] arr = { 5, 3, 4, 5, 6, 8, 9 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = arr[i] - arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] + arr[arr.length - 1 - i];
			arr[i] = arr[arr.length - 1 - i] - arr[i];
		}
	}
}
