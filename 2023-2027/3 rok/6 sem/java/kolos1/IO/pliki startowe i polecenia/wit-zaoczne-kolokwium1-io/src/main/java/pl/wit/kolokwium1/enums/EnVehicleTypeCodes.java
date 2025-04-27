package pl.wit.kolokwium1.enums;

public enum EnVehicleTypeCodes {
	truck(1), car(2), bus(3), motorcycle(4);
	
	private int id;
	
	public int getId() {
		return id;
	}

	private EnVehicleTypeCodes(int id) {
		this.id=id;
	}
}
