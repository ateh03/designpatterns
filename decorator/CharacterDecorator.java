package csce247.decorator;

/**
 * extends the character decorator into the actual potato class
 */
CharacterDecorator extends PotatoeDriver;
public abstract class CharacterDecorator {
	protected String character;
	/**
    * creates the character 
    */
	public String CharacterDecorator() {
		return character;
	}
	
	public abstract double customize();
	
}