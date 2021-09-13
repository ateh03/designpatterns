package csce247.decorator;
/**
 * extends the mouth into the character decorator class
 */
public class Mouth extends CharacterDecorator {
	/**
     * defines the mouth
    */
	public Mouth() {
		this.description = "the mouth for mr. potato head";
	}
	
	public double customize() {
		return " ___________ ";
	}
}