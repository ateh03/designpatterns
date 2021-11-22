package state;

public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;

    private int score = 0;
    private Scanner reader;

    public ArithmeticGame(int count) {
        easyState = new easyState(this);
        mediumState = new mediumState(this);
        hardState = new hardState(this);

        this.count = count; 

        if(state > 0) {
			state = easyState;
		} 
        
        else if(state = 1) {
			state = mediumState;
		}

        else {
            state = hardState;
        }

    }

    public void pressQuestionButton() {
        state.pressQuestionButton();

    }

    public setState(State state) {
        this.state = state;

    }

    public State getEasyState() {
        return easyState;

    }

    public State getMediumState() {
        return mediumState;

    }

    public State getHardState() {
        return hardState;

    }

}