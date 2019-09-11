package ncs.test7;

public class Student extends Human {
	//field
	private String number;
	private String major;
	
	//constructor
	public Student() {
		
	}
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	//getter & setter
	//getter
	public String getNumber() {
		return number;
	}
	public String getMajor() {
		return major;
	}
	//setter
	public void setNumber(String number) {
		this.number = number;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	//method
	@Override
	public String toString() {
		return super.toString()+"\t"+number+"\t"+major;
	}
}
