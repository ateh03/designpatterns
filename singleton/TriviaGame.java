import java.util.ArrayList;
import java.util.Scanner;
/**
 * The dialogue questionnaire for the trivia game
 */
public class TriviaGame {
    /**
    * Trivia game private variables for the local environment
    */
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    
    /**
    * The private static variable for the trivia game class
    */
    private TriviaGame() {}
    /**
    * The public static that pulls the entrance game question for users
    */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
			System.out.println("Would you like to play a game?");
			triviaGame = new TriviaGame();
		}
		return triviaGame;
    }

    public void play() {
        if (isCorrect()) {
			System.out.println("That answer is correct");
			score += 1;
			correctAnswer = true;
		}

    }

    private boolean playRound() {
        if (playRound()) {
			return rand;
		}
    }
}