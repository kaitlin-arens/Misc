import javax.swing.*;

public class HW4PartC
{
  public static void main (String[]args)
  {
    
    String input = JOptionPane.showInputDialog("Enter a String");
    char c = input.charAt(0);
    String newString = "";
    
    
    for (int i = 0; i < input.length(); i++)
    {
       if (input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
       {
         newString = newString + '_';
       }
       
       else
       {
         newString = newString + input.charAt(i);
       }
      System.out.println(newString);
    }
    
    
  }
}