package sessions.session03;

import java.util.Arrays;

public class Person {
	// toate variabilele membru TREBUIE sa fie private
	private String name;
	private String cnp;
	private int age;
	private String nationality;

	public Person(String name, String cnp, int age) {
		this.name = name;
		this.cnp = cnp;
		this.age = age;
	}

	public Person() {
		this("N/A", "N/A", 0);
//		this.name = "N/A";
//		this.cnp = "N/A";
//		this.age = 0;
	}

	// se creeaza automat
	// public Person() {
	// }

	public void showInfo() {
		System.out.println(cnp + ": " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// method overloading
	public void doSomething() {
		System.out.println(1);
	}

	// method overloading
	public void doSomething(int x) {
		System.out.println(2);
	}

	// method overloading
	public void doSomething(String x) {
		System.out.println(x);
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void testParameters(int x) {
		x = 7;
	}

	public void testParameters(Person p) {
		// p = new Person("2", "2", 2);
		p.setName("2");
	}

	public void variableParameters(int... params) {
		System.out.println(Arrays.toString(params));
	}
}
