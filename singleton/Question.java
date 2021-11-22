<<<<<<< HEAD
/**
* The public method that chooses the question as well as the corresponding answers for selection
*/
public class Question {
    /**
    * The private variables for the question method
    */
    private String question;
    private String[] answers;
    private int correctAnswers;
    /**
    * The method with the following question and its four answers, including the correct answer
    */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;

    }
    /**
    * Neatly organizes the alotted question and its answers
    */
    public String toString() {
        System.out.println("Answer: "+question+("?\n"));
        System.out.println("Answer 1: "+ans1+("\n"));
        System.out.println("Answer 2: "+ans2+("\n"));
        System.out.println("Answer 3: "+ans3+("\n"));
        System.out.println("Answer 4: "+ans4+("\n"));
        return super.toString();
    }
    /**
    * Determines whether the answer is correct
    */
    public boolean isCorrect(int userAnswer) {
        return true;
        System.out.println("That answer is correct!");
    }
    /**
    * Fetches the correct answer
    */
    public String getCorrectAnswer() {
        return correctAnswer;
  
    }
    
}
=======
/**
* The public method that chooses the question as well as the corresponding answers for selection
*/
public class Question {
    /**
    * The private variables for the question method
    */
    private String question;
    private String[] answers;
    private int correctAnswers;
    /**
    * The method with the following question and its four answers, including the correct answer
    */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;

    }
    /**
    * Neatly organizes the alotted question and its answers
    */
    public String toString() {
        System.out.println("Answer: "+question+("?\n"));
        System.out.println("Answer 1: "+ans1+("\n"));
        System.out.println("Answer 2: "+ans2+("\n"));
        System.out.println("Answer 3: "+ans3+("\n"));
        System.out.println("Answer 4: "+ans4+("\n"));
        return super.toString();
    }
    /**
    * Determines whether the answer is correct
    */
    public boolean isCorrect(int userAnswer) {
        return true;
        System.out.println("That answer is correct!");
    }
    /**
    * Fetches the correct answer
    */
    public String getCorrectAnswer() {
        return correctAnswer;
  
    }
    
}
>>>>>>> 6b5804b4453b4b876fc4873e4c4c7016ac2333d4
