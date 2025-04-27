package pl.wit.kolokwium1;

import java.util.HashSet;
import java.util.Set;

import pl.wit.kolokwium1.enums.EnBodyType;
import pl.wit.kolokwium1.enums.EnEngineTypes;
import pl.wit.kolokwium1.types.AbstractVehicleType;

/**
 * Klasa abstrakcyjna przechowujaca
 * podstawowe dane o samochodzie
 * @author Lukasz
 *
 */
public abstract class AbstractVehicle{
	//Typ pojazdu
	
	//Typ silnika

	//pojemność silnika

	//kolor pojazdu

	//moc silnika
	
	//max moment obrotowy

	//typ nadwozia

	Set<EnBodyType> setForbiddenTypes = null;
	//Metoda zwracająca zbiór zakazanych typów nadwozia
	public abstract Set<EnBodyType> getForbiddenTypes();
	//Konstruktor parametryczny
	public AbstractVehicle(AbstractVehicleType vehicleType, EnEngineTypes engineType,Integer engineCapacity,String color,Integer enginePower,Integer engineTorque,EnBodyType bodyType) {
		//obsługa zmiennych składowych klasy
		//...
		
		//Pobranie zabronionych typów
		this.setForbiddenTypes = getForbiddenTypes();
		//Jeśli null to inicjalizacja pustym zbiorem
		if(this.setForbiddenTypes == null)
			setForbiddenTypes = new HashSet<>();
		
		//Jeśli pojazd ma zdefiniowany zakazany typ nadwozia to wygeneruj wyjątek
		
	}
	
	public String forbiddenTypesToString() {
		StringBuilder sb = new StringBuilder();
		//pętla po zbiorze setForbiddenTypes
		//...
		
		return sb.toString();
		
	}
	///////////////////////////////////////
	// getters 
	///////////////////////////////////////	
	
	
}
