public class GILTest
{
  public static void main (String[]args)
  {
    Assignment assignment = new Assignment();
    assignment.homework("Homework 4\n");
    
    int errors = 0;
    
    GenericList <Integer> list = new GenericList <Integer>();
    
    if(list.size() != 0)
    {
      System.out.println("ERROR: A new list does not return size of 0");
      errors ++;
    }
    
    list.add(3);
    
    if(list.size()!= 1)
    {
      System.out.println("ERROR: Add one element to list does not return size of 1");
      list.display();
      errors++;
    }
    
    if(list.get(0)!= 3)
    {
      System.out.println("ERROR: The value of the eleventh element is not what we set it to be");
      errors++;
    }
    
    System.out.println("Display list with one element");
    list.display();
    
    for(int i = 0; i < 9; i++)
    {
      list.add(i);
    }
    
    if(list.size() != 10)
    {
      System.out.println("ERROR: The size is not equal to 10");
      errors++;
    }
    
    System.out.println("Display list with 10 elements");
    list.display();
    
    System.out.println("Add one element to see expansion");
    list.add(33);
    
    
    if(list.size() != 11)
    {
      System.out.println("ERROR: The size is not equal to 11");
      errors++;
    }
    
    if(list.get(10) != 33)
    {
      System.out.println("ERROR: The value is not equal to 33");
      errors++;
    }
    
    
    
    //System.out.println("Causing out of bounds error on get");
    
    list.get(100);
    
    list.get(-44);
    
    //if(list.get(100) > list.size())
    //{
      //System.out.println("ERROR: Out of bounds");
      //errors++;
    //}
    
    System.out.println("Display list with eleven elements.  List expanded");
    list.display();
    
    list.insert(0,2222);
    list.display();
    
    
    if(list.size()!= 12)
    {
      System.out.println("ERROR: Add one more element to list does not return size of 12");
      errors++;
    }
    
    if(list.get(0) != 2222)
    {
      System.out.println("ERROR: The value of the first element is not what we set it to be");
      errors++;
    }
    
    list.insert(5,49);
    
    if(list.size()!=13)
    {
      System.out.println("ERROR: Add one more element to list does not return size of 13");
      errors++;
    }
    
    if(list.get(5)!= 49)
    {
      System.out.println("ERROR: The value of the sixth element is not what we set it to be");
      errors++;
    }
    
    System.out.println("Display list with insert at index 5");
    list.display();
    
    String stringList = list.toString();
    
    if(!("2222, 3, 0, 1, 2, 49, 3, 4, 5, 6, 7, 8, 33".equals(stringList)))
    {
      System.out.println("ERROR: toString does not return a properly formatted string");
      System.out.println("Error: > " + stringList + " < ");
      errors++;
    }
    
    list.set(7, 8888);
    list.set(22, 22);
    list.set(-5,22);
    
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
    list.remove(-11);
    
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