package example.codeclan.com.rpsandroidapp;

import java.util.Random;

public class Game {

    private ChoiceType handOne;
    private ChoiceType handTwo;
    String winner;
    int playerOnescore = 0;
    int playerTwoscore = 0;

    public Game(){
        handOne = null;
        handTwo = setUpComputer();
        winner = null;

    }


    //Setting up method for Computer's randomhand
    private ChoiceType setUpComputer(){
        int computerHand = new Random().nextInt(ChoiceType.values().length);
        return ChoiceType.values()[computerHand];
    }

    //Getters and setters for handTwo and HandOne (namely for tests)
    public ChoiceType getHandTwo() {
        return handTwo;
    }

    public void setHandTwoForTest(ChoiceType choiceType){
        this.handTwo = choiceType;
    }

    public ChoiceType getHandOne() {
        return handOne;
    }

    public void setHandOne(ChoiceType handOne) {
        this.handOne = handOne;
    }

    public int getPlayerOnescore(){
        return playerOnescore;
    }

    public int getPlayerTwoscore(){
        return playerTwoscore;
    }


    //Returning String after comparing hands and announces the winner.
    public String compareHands(){
        if ((handOne == ChoiceType.PAPER && handTwo == ChoiceType.ROCK ) || (handOne == ChoiceType.SCISSORS && handTwo == ChoiceType.PAPER) || (handOne == ChoiceType.ROCK && handTwo == ChoiceType.SCISSORS)){
            playerOnescore ++;
            return "Player One Wins";
        }
        else if ((handTwo == ChoiceType.PAPER && handOne == ChoiceType.ROCK) || (handTwo == ChoiceType.SCISSORS && handOne == ChoiceType.PAPER) || (handTwo == ChoiceType.ROCK && handOne == ChoiceType.SCISSORS)) {
            playerTwoscore ++;

            return "Player One Wins";
        }
            return tie();
        }

    public String tie(){
        if (handOne == handTwo){
        }
        return "It's a tie.";
    }
}
