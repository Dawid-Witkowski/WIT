package pl.wit.kolokwium1;

import java.util.Set;

import pl.wit.kolokwium1.enums.EnBodyType;
import pl.wit.kolokwium1.enums.EnEngineTypes;
import pl.wit.kolokwium1.types.MotorcycleType;

public class Motorcycle extends AbstractVehicle {

	public Motorcycle(EnEngineTypes engineType, Integer engineCapacity, String color, Integer enginePower,
			Integer engineTorque, EnBodyType bodyType) {
		super(new MotorcycleType(),engineType, engineCapacity, color, enginePower, engineTorque, bodyType);
		
	}

	@Override
	public Set<EnBodyType> getForbiddenTypes() {
		return null;
	}

}
