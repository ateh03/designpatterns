package csce247.factory;

public abstract class HousePlanFactory {

	public abstract HousePlan createPizza(String type);
	/**
    * Defines the necessary creation materials for the House plan. This lists the following 'void' variables
    */
	public HousePlan createHousePlan(String type) {
		Houseplan house = createHousePlan(type);
		
		house.setMaterials();
		house.setFeatures();
		
		return house;
	}
	
}