package ncs.test9;

public class Airplane extends Plane {
	//constructor
	public Airplane() {
		
	}
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		int fuelSize = this.getFuelSize()-distance / 10 * 30;
		this.setFuelSize(fuelSize);
	}
}
