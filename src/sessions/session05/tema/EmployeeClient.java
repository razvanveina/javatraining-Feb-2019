package sessions.session05.tema;

public class EmployeeClient {
	public static void main(String[] args) {
		EmployeeClient employeeClient = new EmployeeClient();
		employeeClient.doAction();
	}

	private void doAction() {
		Employee emp1 = new Employee("Ghita", 30, 1000, null);
		Employee emp2 = new Employee("Ion", 31, 2000, null);
		Employee emp3 = new Employee("Mircea", 33, 3000, null);
		Employee emp4 = new Employee("Mihai", 35, 4000, null);
		Employee emp5 = new Employee("Adela", 22, 5000, null);
		Employee emp6 = new Employee("Sorin", 22, 5000, null);

//		emp2.setManager(emp3);
//		emp4.setManager(emp3);
//		emp5.setManager(emp2);
//		emp1.setManager(emp4);
//		emp6.setManager(emp5);

		emp3.setSubordinates(new Employee[] { emp2, emp4 });
		emp2.setSubordinates(new Employee[] { emp5 });
		emp4.setSubordinates(new Employee[] { emp1 });
		emp5.setSubordinates(new Employee[] { emp6 });

		Employee[] emp = { //
				emp1, emp2, emp3, emp4, emp5, emp6 };

		showEmployees(emp);

		Employee manager = findManager(emp);
		manager.show();

		manager.display("");

	}

	private Employee findManager(Employee[] employees) {
		for (Employee emp : employees) {
			if (emp.isManager()) {
				return emp;
			}
		}
		return null;
	}

	private void showEmployees(Employee[] employees) {
		for (Employee emp : employees) {
			emp.show();
		}
	}

}
