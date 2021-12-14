public class GSLTest
{
  public static void main (String[]args)
  {
    Assignment assignment = new Assignment();
    assignment.homework("Homework 3\n");
    
    int errors = 0;
    
    GenericList <String> list = new GenericList <String>();
    
    if(list.size() != 0)
    {
      System.out.println("ERROR: A new list does not return size of 0");
      errors ++;
    }
    
    list.add("Hi");
    
    if(list.size()!= 1)
    {
      System.out.println("ERROR: Add one element to list does not return size of 1");
      list.display();
      errors++;
    }
    
    if(list.get(0)!= "Hi")
    {
      System.out.println("ERROR: The value of the eleventh element is not what we set it to be");
      errors++;
    }
    
    System.out.println("Display list with one element");
    list.display();
    
    for(int i = 0; i < 9; i++)
    {
      list.add(i + "M");
    }
    
    if(list.size() != 10)
    {
      System.out.println("ERROR: The size is not equal to 10");
      errors++;
    }
    
    System.out.println("Display list with 10 elements");
    list.display();
    
    System.out.println("Add one element to see expansion");
    list.add("K");
    
    
    if(list.size() != 11)
    {
      System.out.println("ERROR: The size is not equal to 11");
      errors++;
    }
    
    list.get(44);
    list.get(-11);
    
    if(list.get(10) != "K")
    {
      System.out.println("ERROR: The value is not equal to K");
      errors++;
    }
    
    System.out.println("Display list with eleven elements.  List expanded");
    list.display();
    
    list.insert(0,"I");
    list.display();
    
    
    if(list.size()!= 12)
    {
      System.out.println("ERROR: Add one more element to list does not return size of 12");
      errors++;
    }
    
    if(list.get(0) != "I")
    {
      System.out.println("ERROR: The value of the first element is not what we set it to be");
      errors++;
    }
    
    list.insert(5,"T");
    
    if(list.size()!=13)
    {
      System.out.println("ERROR: Add one more element to list does not return size of 13");
      errors++;
    }
    
    if(list.get(5)!="T")
    {
      System.out.println("ERROR: The value of the sixth element is not what we set it to be");
      errors++;
    }
    
    System.out.println("Display list with insert at index 5");
    list.display();
    
    String stringList = list.toString();
    
    if(!("I, Hi, 0M, 1M, 2M, T, 3M, 4M, 5M, 6M, 7M, 8M, K".equals(stringList)))
    {
      System.out.println("ERROR: toString does not return a properly formatted string");
      System.out.println("Error: > " + stringList + " < ");
      errors++;
    }
    
    list.set(7, "Hello");
    list.set(55, "HI");
    list.set(-22, "HI");
    
    if(list.size() != 13)
    {
      System.out.println("ERROR:  List is out of bounds");
      errors++;
    }
    
    System.out.println("Display list with set");
    
    list.display();
    
    //list.set(20, "This should be out of bounds");
    
    
    list.remove(10);
    list.remove(33);
    list.remove(-22);
    
    if(list.size()!= 12)
    {
      System.out.println("ERROR: Not the correct size");
      errors++;
    }
    System.out.println("This is the removal section");
    list.display();
    
    list.clear();
    
    if(list.size()!=0)
    {
      System.out.println("ERROR: An empty list does not return size of 0");
      errors++;
    }
    
    System.out.println("Display list that has been cleared");
    list.display();
    
    if(errors == 0)
    {
      System.out.println("No errors found!");
    }
  }
}