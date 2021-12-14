import java.util.Scanner;

public class DoorLarry
{
  public static void main (String [] args)
  {
    Scanner kb = new Scanner (System.in);
    int age;
 
    System.out.print("Enter age:");
    age = kb.nextInt();
    
    if (age < 21)
    {
    System.out.println("You shall not pass!");
    }
    
    else if (age < 30)
    {
    System.out.println("We hate hipsters, but we will take your money.");
    }
    
    else if (age < 40)
    {
    System.out.println("Welcome in.");
    }
    
    else if (age < 50)
    {
    System.out.println("Your liver can't handle this.");
    }
    
    else // age >= 50 
    {
    System.out.println("Go away!");
    }
    
  }


}