import javax.swing.*;

public class HW4PartA
{
  public static void main (String[]args)
  {
     String input = JOptionPane.showInputDialog("Enter a String");
     String lower = "";
     
     
     for(int i=0; i < input.length(); i++)
     {
       if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
       {
         lower = lower + input.charAt(i) + " ";
       }
      
     }//end for loop
     
     if (lower.length()>0)
    {
      System.out.println(lower);
    }
    
    else
    {
      System.out.println("No lower case letters.");
    }
  }
}