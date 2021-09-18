package csce247.factory;
import java.util.ArrayList;
/**
 * Runs the house plan specs. Is an abstract class so that it may not be modified by users
 */
public abstract class HousePlan(int numRooms, int numWindows, int squareFeet) {
    /**
    * Defines the parameters for the multiple specifications of the house, including windows rooms and sq ft.
    */
	protected ArrayList<String> materials;
	protected ArrayList<String> features;

	private int numRooms;
    private int numWindows;
    private int squareFeet;
	
    /**
    * Will output the set materials used to form the house
    */
    public void setMaterials() {
		System.out.println("Preparing " + materials);
	}
	/**
    * Will output the set features of the house
    */
	public void setFeatures() {
		System.out.println("Setting " + features);
	}
	
    /**
    * Creates an array list that explicitly lists out the materials used in the house. 
    */
	public ArrayList<String> getMaterials() {
        ArrayList<String> materials = new ArrayList<String>();
        materials.add("Logs");
        materials.add("Wood");
        materials.add("Hay");
        materials.add("Cheap Vinyl");
        materials.add("Drywall");
        materials.add("Laminate");
        materials.add("Marble");
	}
	/**
    * Referenced array format from w3schools.com
    */
	public ArrayList<String> getFeatures() {
		ArrayList<String> features = new ArrayList<String>();
        features.add("Tall Ceiling");
        features.add("Merriments");
        features.add("Arches");
        features.add("Ghetto Popcorn Ceiling");
        features.add("Musty Rugs");
        features.add("Sleek");
        features.add("Polished");
	}
	
	public int getNumRooms() {
		System.out.println("Getting " + numRooms);
	}
	
	public int getNumWindows() {
		System.out.println("Getting " + numWindows);
	}
	
	public int getSquareFeet() {
		System.out.println("Getting " + squareFeet);
	}
	/**
    * String that compiles and calculates the customization of the house and outputs the 'result'
    */
	public String toString() {
		String result = "";
		result += "-------- " + materials + " --------\n";
		result += numRooms + "\n";
		result += numWindows + "\n";
        result += squareFeet + "\n";
		
		for(String materials : materials) {
			result += materials + "\n";
		}

        for(String features : features) {
			result += features + "\n";
		}
		
		return result;
	}
}