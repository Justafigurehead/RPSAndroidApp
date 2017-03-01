package example.codeclan.com.rpsandroidapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game();
    }


//    @Test
//    public void testGenerateComputerhand(){
//        assertEquals( ChoiceType.PAPER ,game.getHandTwo());
//    }

    @Test
    public void testCanGetPlayerOneHand(){
        game.setHandOne(ChoiceType.PAPER);
        assertEquals(ChoiceType.PAPER, game.getHandOne());
    }

    @Test
    public void testCanGetWinner(){
        game.setHandOne(ChoiceType.PAPER);
        game.setHandTwoForTest(ChoiceType.ROCK);
        assertEquals("Player One Wins", game.compareHands());
        assertEquals(1, game.getPlayerOnescore());

    }

    @Test
    public void testPlayerOneScoreIncreases(){
        game.setHandOne(ChoiceType.SCISSORS);
        game.setHandTwoForTest(ChoiceType.PAPER);
        game.compareHands();
        assertEquals(1, game.getPlayerOnescore());
    }

    @Test
    public void testPlayerTwoWinsAndScoreIncreases(){
        game.setHandOne(ChoiceType.ROCK);
        game.setHandTwoForTest(ChoiceType.PAPER);
        game.compareHands();
        assertEquals(1, game.getPlayerTwoscore());
    }




}
