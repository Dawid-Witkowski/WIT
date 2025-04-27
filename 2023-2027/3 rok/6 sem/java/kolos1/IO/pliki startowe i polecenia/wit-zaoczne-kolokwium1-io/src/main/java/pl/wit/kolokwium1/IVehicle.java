package pl.wit.kolokwium1;

import pl.wit.kolokwium1.enums.EnBodyType;
import pl.wit.kolokwium1.enums.EnEngineTypes;
import pl.wit.kolokwium1.types.AbstractVehicleType;

public interface IVehicle {
	//Typ pojazdu
	AbstractVehicleType getVehicleType();
	//typ_silnika
	EnEngineTypes getEngineType(); 
	//pojemność
	Integer getEngineCapacity(); 
	//kolor
	String getColor();
	//moc
	Integer getEnginePower();
	//max moment obrotowy
	Integer getEngineTorque(); 
	//typ nadwozia
	EnBodyType getBodyType();
	
	public default boolean matches(AbstractVehicleType vehicleType, EnEngineTypes engineType, Integer engineCapacity, String color, Integer enginePower,
			Integer engineTorque, EnBodyType bodyType) {

		// Obsługa na pojednczych atrybutach

		return matchVehicleType(vehicleType) && matchEngineType(engineType) && matchEngineCapacity(engineCapacity) && matchColor(color)
				&& matchEnginePower(enginePower) && matchEngineTorque(engineTorque) && matchBodyType(bodyType);

	}
	
	private boolean matchVehicleType(AbstractVehicleType vehicleType) {
		if (vehicleType != null && getVehicleType() == null)
			return false;
		else if (vehicleType != null && getEngineType() != null && vehicleType.equals(getVehicleType()) )
			return false;

		return true;
	}

	private boolean matchEngineType(EnEngineTypes engineType) {
		if (engineType != null && getEngineType() == null)
			return false;
		else if (engineType != null && getEngineType() != null && engineType != getEngineType())
			return false;

		return true;
	}
	
	private boolean matchEngineCapacity(Integer engineCapacity) {
		if (engineCapacity != null && getEngineCapacity() == null)
			return false;
		else if (engineCapacity != null && getEngineCapacity() != null && !engineCapacity.equals(getEngineCapacity()))
			return false;

		return true;
	}
	
	private boolean matchColor(String color) {
		if (color != null && getColor() == null)
			return false;
		else if (color != null && getColor() != null && !color.equals(getColor()))
			return false;

		return true;
	}
	
	private boolean matchEnginePower(Integer enginePower) {
		if (enginePower != null && getEnginePower() == null)
			return false;
		else if (enginePower != null && getEnginePower() != null && !enginePower.equals(getEnginePower()))
			return false;

		return true;
	}
	
	private boolean matchEngineTorque(Integer engineTorque) {
		if (engineTorque != null && getEngineTorque() == null)
			return false;
		else if (engineTorque != null && getEngineTorque() != null && !engineTorque.equals(getEngineTorque()))
			return false;

		return true;
	}
	
	
	private boolean matchBodyType(EnBodyType bodyType) {
		if (bodyType != null && getBodyType() == null)
			return false;
		else if (bodyType != null && getBodyType() != null && !bodyType.equals(getBodyType()))
			return false;

		return true;
	}
	
}
