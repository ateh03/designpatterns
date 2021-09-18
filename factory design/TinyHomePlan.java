/**
 * Establishes that the TinyHomePlan extends into the HousePlanDriver
 */
public class TinyHomePlan extends HousePlan {
    /**
    * Unique specifications for this shoddy and ragged tiny house.
    */
    public TinyHomePlan() {
		return materials("Cheap Vinyl");
        return materials("Drywall");

        return features("Ghetto Popcorn Ceiling");
        return features("Musty Rugs");

		numRooms = 3;
        numWindows = 3;
        squareFeet = 300;
	}

}