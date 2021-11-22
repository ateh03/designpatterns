package state;

public class Medium implements State {
    private game ArithmeticGame;
     /**
     * The setter for the 'easy' class that self-identifies the 'game' type 
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
    }
    /**
     * A public getter that retrieves and returns the number variable.
     */
    public int getNum() {
        return num;
    }
    /**
     * A public getter that retrieves and returns the operation variable.
     */
    public String getOperation() {
        return operation;
    }
    /**
     * This void returns nothing establishes whether or not the player wants to level up.
     */
    public void levelUp() {
        System.out.println("You have decided to move to a harder level.");	
        game.setState.levelUp();
    }
    /**
     * This void returns nothing establishes whether or not the player wants to level down.
     */
    public void levelDown() {
        System.out.println("You have decided to move to an easier level.");	
        game.setState.levelDown();
    }

}
