/**
 * Establishes that the logCabinPlan extends into the HousePlanDriver
 */
public class logCabinPlan extends HousePlan {
    /**
    * Unique specifications for this exquisite log cabin
    */
    public logCabinPlan() {
		return materials("Wood");
        return materials("Logs");
        return materials("Hay");

        return features("Tall Ceiling");
        return features("Merriments");

		numRooms = 5;
        numWindows = 4;
        squareFeet = 1500;
	}

}
