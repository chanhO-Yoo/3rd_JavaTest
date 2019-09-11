package ncs.test9;

public class Cargoplane extends Plane {
	//constructor
	public Cargoplane() {
		
	}
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	//method
	public void flight(int distance) {
		int fuelSize = this.getFuelSize()-distance/10*50;
		this.setFuelSize(fuelSize);
	}
}
