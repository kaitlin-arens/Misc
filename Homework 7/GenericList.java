//Kaitlin Arens
import java.util.*;

public class GenericList<X>  implements MyStorage<X>
{
  private X[] arr;
  private int size;
  
  public GenericList()
  {
    this.newArray(); 
  }
  
  
  public int size()
  {
     return size;
  }
  
  public void add(X value)
  {    
    if(size == arr.length)
    {
      this.expandArray(); 
    }
    
    arr[size] = value;
    size++;
  }
  
  public X get(int index) throws ArrayIndexOutOfBoundsException
    {
      if(index >=0 && index < size)
      {
        return arr[index];
      }
      
      else
      {
        throw new ArrayIndexOutOfBoundsException();
      }
     
    }
    
  public void display()
  {
    
    for(int i = 0; i < size; i++)
    {
      
      System.out.println(i + ":" + arr[i]);
    }
    
    if(arr.length == size)
    {
      System.out.println("List is full\n");
    }
    
    else
    {
      System.out.println("List has " + (arr.length - size) + " space(s) left\n");
    }
  }
  
  /*private void newArray()
  {
    arr = (X[])new Object[10];
    size = 0;
  }*/ 
  
  private void expandArray()
  {
    X[] arr2;
    arr2 = (X[])new Object[(int)(arr.length*1.2)];
        
    for(int i =0; i < arr.length; i++)
    {
      arr2[i] = arr[i];
    }  
    arr = arr2;
  }
  
  public void insert(int index, X value)
  {
    
    if (index >= size)
    {
      add(value);
    }
    
    else//Shift elements to insert
    {
      if(size == arr.length)//make more room to insert
      {
        this.expandArray();
      }
      
      for(int i = size; i > index; i--)//insert one more value/open a hole
      {
        arr[i] = arr[i-1];
      }  
      arr[index] = value;
      size++;
    }
  }
  
  public String toString()
  {
    String returnValue = String.valueOf(arr[0]);
    
    if(arr[0] == null)
    {
      return "";
    }
    
    for(int i = 1; i < size; i++)
    {
      returnValue = returnValue + ", " + arr[i];
    }
    
    return returnValue;
  } 
  
  public void clear()
  {
    this.newArray();
  }
  
  public void set(int index, X value) throws ArrayIndexOutOfBoundsException
  {
    if(index >=0 && index < size)
    {
      arr[index]= value;
    }
    
    else
    {
      throw new ArrayIndexOutOfBoundsException();
    }
  } 
  
  public void remove(int index) throws ArrayIndexOutOfBoundsException
  {
    if(index >= 0 && index < size)
    {
      for(int i = index; i < size; i++)
      { 
        arr[i] = arr[i+1];
      }  
      size--;
    }
    
    else
    {
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  
  public X peek()
  {
    return value;
  }
  
  public boolean isEmpty()
  {
    if(size ==0)
    {
      return true;
    }
    
    else
    {
      return false;
    }
  }
  
  public void push(X value)
  {
  
  }
  
  public X pop()
  {
  
  }
  
}