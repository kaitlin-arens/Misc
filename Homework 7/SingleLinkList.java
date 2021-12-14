/*
 * Tim McGowen
 * 9/20/2015
 */
public class SingleLinkList //implements MyStorage<X>
{
    // The engine to our train of boxcars
    private Boxcar head;
    private Boxcar tail;
    private int size;
    /**
     * Constructor for objects of class SingleLinkList
     */
    public SingleLinkList()
    {
        // initialise instance variables
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Display linked list
     */
    public String toString()
    {
        String s = "engine";
        if (head != null)
        {
            Boxcar boxcar = head;
            do {
              s = s + "->" + boxcar.data().toString();
              boxcar = boxcar.next();
            } while (boxcar != null);
        }
        return s; 
    }
    
     /**
     * Return size of linked list
     */
    public int size()
    {
        return size;
    }
    
    /**
     * Add boxcar to end
     */
    public void addBoxcarToEnd(Boxcar b)
    {
      if (head == null)
      {
        head = b;
        tail = b;
      }  
      else
      {
        // Find the last boxcar and add it to the end
        Boxcar boxcar = tail;
        boxcar.setNext(b);
        tail = b;
      }
      size++;
    }
    
    /**
     * Add boxcar to front
     */
    public void addBoxcarToFront(Boxcar b)
    {
      if(head == null)
      {
        head = b;
        tail = b;
      }
      
      else
      {
        
        Boxcar boxcar = head;
        head = b;
        b.setNext(boxcar);  
      }
      size++;
    }
    
    /**
     * Remove boxcar from front
     */
    public void removeBoxcarFromFront()
    {
      if(head != null)
      {
        head = head.next();
        size--;
      }
      
      if(head == null)
      {
        tail = null;
      }
      // Enter your code for removeBoxcarFromFront
    }
    
    /**
     * Remove boxcar from end
     */
    public void removeBoxcarFromEnd()
    {
      if (head != null)
      {
        // If there is just one boxcar remove it
        if (head.next() == null)
        {
          head = null;
          tail = null;  
        }
        
        else
        {
          // Find the last boxcar and remove it
          Boxcar boxcar = head;
          Boxcar prevBoxcar = head;
          while (boxcar.next() != null)
          {
            prevBoxcar = boxcar;
            boxcar = boxcar.next();
          }
          prevBoxcar.setNext(null);
          tail = prevBoxcar;
        }
        size--;
      } 
    }
}
