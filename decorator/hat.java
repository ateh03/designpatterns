package csce247.decorator;
/**
 * extends the hat into the character decorator class
 */
public class Hat extends CharacterDecorator {
	/**
     * defines the hat
    */
	public Nose() {
		this.description = "the hat for mr. potato head";
	}
	
	public double customize() {
		return " |-----------| ";
	}
}