public class StackLL
{
  private Node sp;
  private int count;//number of elements in stack
  
  public StackLL()
  {
    sp = null;
    count = 0;
  }
  
  public void push(int e)
  {
    Node nn = new Node(e);
    nn.next = sp;
    sp = nn;
    
    count++;
  }
  
  public int pop()
  {
    int rv = 0;
    
    if(! isEmpty())
    {
      rv = sp.d;//get data from top node
      sp = sp.next;  
      count--;
    }
    else //empty stack pop
    {
      System.out.println("Attempt to pop empty stack");
      System.exit(0);
    }
    return rv;
  }
  
  public boolean isEmpty()
  {
    return count == 0;
  }
  
  public boolean isFull()
  {
    return false;
  }
  
  public int size()
  {
    return count;
  }
  
  private class Node
  {
    public int d;
    public Node next;
    
    public Node (int e)
    {
      d = e;
      next = null;
    }
  }// node inner class
 
  public static void main (String[]args)
  {
    StackLL s = new StackLL();
    
    s.push(27);
    s.push(64);
    s.push(128);
    
    System.out.println("size = " + s.size());
    
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
  } 
}