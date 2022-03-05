/**
 * 
 */
package imths.edu.ics211.h07;

/**
 * @author isaacsegawa
 * @param <E> the type.
 */
public class Stack<E> implements IStack211<E> {

  private LinkedNode top;
  
  public Stack() {
    
  }
  
  @Override
  public boolean empty() {
    // TODO Auto-generated method stub
    return false;
  }


  @Override
  public E push(E item) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public E peek() {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public E pop() {
    // TODO Auto-generated method stub
    return null;
  }

  private class LinkedNode {
    E item;
    LinkedNode next;
    
    public LinkedNode(E item, LinkedNode next) {
      this.item = item;
      this.next = next;
    }
  }
}
