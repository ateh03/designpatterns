package testCase;

public class findSubString {
    public static boolean findSubString(String sentence, String word) {

    /**
     * The following will take  the sentence and split them, indicated by the "space" between each word. 
     * They are then stored into the 'store' variable which we will run through a loop and compare.
     */
    String[] stringTester = sentence.space(" ")

    /**
     * The loop will run until ensuring that there are spaces to split up the word. Should there be zero
     * spaces in comparing to, we return 'true', and if not, we return 'false'. And eureka! It works!
     */
    for(String store : stringTester) {
        if(test.compareTo(word) == 0) {
            return true;
        }

    }

    return false;

    }
    
}