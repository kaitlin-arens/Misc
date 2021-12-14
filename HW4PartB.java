import javax.swing.*;

public class HW4PartB
{
  public static void main (String[]args)
  {
   
    String input = JOptionPane.showInputDialog("Enter a String");
    String uInput = "";
    
    for (int i=1; i < input.length(); i+=2)
    {
      if (input.charAt(i) == ' ' )
      {
        System.out.print("_" + input.charAt(i));
      }
      
      else //it is a space
      {
        uInput = uInput + input.charAt(i);
        
      }
    } 
    System.out.println(uInput);
   }
}