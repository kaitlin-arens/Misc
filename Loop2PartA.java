//lost the paper for this assignment, so I could not complete it


import javax.swing.*;

public class Loop2PartA
{
  public static void main (String[]args)
  {
    float sum = 0;
    int n = 0;
    float average = 0;
    String userInput = "0";
    
    while ( !userInput.equals( "exit"))
    {
      sum = sum + Float.parseFloat(userInput);
      n++;
      
      userInput = JOptionPane.showInputDialog("Enter a number or type exit to quit.");
    }//end while loop
    
    n--;
    
    if(n >0)
    {
      average = sum/n;
    }
    
    else 
    {
      System.out.println("No values entered.");
    }  
    
    System.out.println(average);
  }

}