package ncs.test10;

public class Sales extends Employee implements Bonus{
	//constructor
	public Sales() {
		
	}
	public Sales(String name, int number, String department, int salary) {
		super(name, number,department,salary);
	}
	
	//method
	@Override
	public double tax() {
		return this.getSalary()*0.13;
	}
	
	@Override
	public void incentive(int pay) {
		double incentive = this.getSalary()+pay*1.2;
		this.setSalary((int)incentive);
	}
}
