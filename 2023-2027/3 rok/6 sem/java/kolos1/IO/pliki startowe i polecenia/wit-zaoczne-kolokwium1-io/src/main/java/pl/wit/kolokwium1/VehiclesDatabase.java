package pl.wit.kolokwium1;

import java.util.HashSet;
import java.util.Set;

import pl.wit.kolokwium1.enums.EnBodyType;
import pl.wit.kolokwium1.enums.EnEngineTypes;
import pl.wit.kolokwium1.types.AbstractVehicleType;

public class VehiclesDatabase {
	//
	private Set<IVehicle> setVehicles = null;
	
	public VehiclesDatabase() {
		setVehicles = new HashSet<IVehicle>();
	}
	
	public void addVehicleToDb(AbstractVehicle vehicle) {
		
	}
	
	public Set<IVehicle> searchDb(AbstractVehicleType vehType, EnEngineTypes engineType, Integer engineCapacity, String color, Integer enginePower,
			Integer engineTorque, EnBodyType bodyType){
		Set<IVehicle> setResults = new HashSet<IVehicle>();
		for(IVehicle veh:setVehicles) {
			if(veh.matches(vehType,engineType, engineCapacity, color, enginePower, engineTorque, bodyType))
				setResults.add(veh);
		}
		return setResults;
	}
}
