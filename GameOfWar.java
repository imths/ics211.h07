/**
 * 
 */
package imths.edu.ics211.h07;

/**
 * @author isaacsegawa
 *
 */
public class GameOfWar implements IGameOfWar {

  public GameOfWar() {
    //initialize players' decks
  }
  
  @Override
  public void initializeGame(Deck d) {
    //loop through deck, give cards to players, don't shuffle (tests were made with specific decks)
    
  }


  @Override
  public boolean playARound() {
    //
    return false;
  }


  @Override
  public Stack<Card> playerOnesCards() {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Stack<Card> playerTwosCards() {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Stack<Card> combineStacks(Stack<Card> top, Stack<Card> bottom) {
    //put top stack into stack, add bottom, reverse into returned stack (push stack to returned
    //stack)
    return null;
  }

}
