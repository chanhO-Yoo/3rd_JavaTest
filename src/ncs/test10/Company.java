package ncs.test10;

public class Company {
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery",1,"secretary",800);
		employees[1] = new Sales("Clinten",2,"salse     ",1200);
		
		System.out.println("name\tdepartment\tsalary");
		System.out.println("--------------------------------");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println("인센티브 100 지급");
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("--------------------------------");
		
		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);
		
		for(Employee e : employees) {
			System.out.print(e);
			System.out.println("\t"+e.tax());
		}
	}
}
