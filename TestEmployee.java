package ClassesClass;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		alex.salary = 80000;
		alex.bonus = 20000;
		alex.calculateTotalPay();
		
		linda.salary = 95000;
		linda.bonus = 20000;
		linda.calculateTotalPay();
		
		john.salary = 80000;
		john.bonus = 10000;
		john.calculateTotalPay();

	}

}
