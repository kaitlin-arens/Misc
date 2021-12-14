public class GSL
{
  private String arr[];
  private int size;
  
  public GSL()
  {
    arr = new String[10];
    size = 0;
  }
  
  
  public int size()
  {
     return size;
  }
  
  public void add(String value)
  {
    //System.out.println("add Array length: " + arr.length);
    //System.out.println("add Size: " + size);
    //System.out.println("Value " + value);
    
    if(size == arr.length)
    {
      String[] arr2 = new String[(int)(arr.length * 1.2)];
      
      for (int i = 0; i < arr.length; i++)
        arr2[i] = arr[i];
        
      arr = arr2; 
    }
    
    arr[size] = value;
    size++;
  }
  
  public String get(int index)
    {
      return arr[index];
    }
    
  public void display()
  {
    //System.out.println("Array length: " + arr.length);
    //System.out.println("Size: " + size);
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
  
  public void insert(int index, String value)
  {
    /*System.out.println("This is the insert index: " + index);
    System.out.println("This is the insert value: " + value);
    System.out.println("Array length: " + arr.length);
    System.out.println("Size: " + size);*/ 
    
    if (index >= size)
    {
      add(value);
    }
    
    else//Shift elements to insert
    {
      if(size == arr.length)//make more room to insert
      {
        String[] arr2 = new String[(int)(arr.length*1.2)];
        
        for(int i =0; i < arr.length; i++)
        {
          arr2[i] = arr[i];
        }  
        
        arr = arr2;
        //System.out.println("b: "); 
        //display();
      }
      
      for(int i = size; i > index; i--)//insert one more value/open a hole
      {
        arr[i] = arr[i-1];
      }  
      arr[index] = value;
      size++;
      
      //System.out.println("c: ");
      //display();
    }
  }
  
  public String toString()
  {
    String returnValue = String.valueOf(arr[0]);
    
    for(int i =1; i < size; i++)
    {
      returnValue = returnValue + ", " + arr[i];
    }
    return returnValue;
  } 
  
  public void clear()
  {
    arr = new String [10];
    size = 0;
  }
  
  public void set(int index, String value)
  {
    if(index > arr.length)
    {
      System.out.println("ERROR: Index is greater than the array length");
    }
    
    else
    {
      arr[index]= value;
    }
  } 
  
  public void remove(int index)
  {
    //System.out.println("Index inside remove method. Index = " + index);
    
    if(index > arr.length)
    {
      System.out.println("Error index is greater than array length");
    }
    
    if(index == arr.length - 1)
    {
      size--; 
    }
    
    else if(index <= arr.length)
    {
      //arr[index] = 0;
      
      for(int i = index; i < size; i++)
      {
        //System.out.println("Move arr["+ i +"] from arr[" + (i + 1) +"]" ); 
        arr[i] = arr[i+1];
      }  
      size--;
      //System.out.println("Size at the end of remove method " + size);
    }
  }
}