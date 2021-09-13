package csce247.decorator;
/**
 * extends the nose into the character decorator class
 */
public class Nose extends CharacterDecorator {
	/**
     * defines the nose 
    */
	public Nose() {
		this.description = "the nose for mr. potato head";
	}
	
	public double customize() {
		return " < ";
	}
}