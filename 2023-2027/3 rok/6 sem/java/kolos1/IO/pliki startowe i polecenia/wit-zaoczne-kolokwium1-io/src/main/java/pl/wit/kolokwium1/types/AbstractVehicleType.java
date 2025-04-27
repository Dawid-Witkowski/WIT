package pl.wit.kolokwium1.types;

public abstract class AbstractVehicleType {
	
	public abstract Integer getVehicleTypeId();
	public abstract String getVehicleTypeName();
	
	//Metoda zwracająca aktualny stan obiektu w postaci String'a
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//implementacja...
		
		return sb.toString();
	}
	
	public boolean equals(AbstractVehicleType type) {
		return this.getVehicleTypeId().equals(type.getVehicleTypeId())
		&& this.getVehicleTypeName().equals(type.getVehicleTypeName());
	}
}
