package ncs.test10;

public class Secretary extends Employee implements Bonus {
	//constructor
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	//method
	@Override
	public double tax() {
		return this.getSalary()*0.1;
	}
	
	@Override
	public void incentive(int pay) {
		double incentive = this.getSalary() + pay*0.8;
		this.setSalary((int)incentive);
	}
	
}
