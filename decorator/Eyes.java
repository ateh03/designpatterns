package csce247.decorator;
/**
 * extends the 'eye' into the character decorator method
 */
public class Eyes extends CharacterDecorator {
	/**
    * defines the eye
    */
	public Eyes() {
		this.description = "o           o";
	}
	
	public double customize() {
		return character;
	}
}