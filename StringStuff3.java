import javax.swing.*;

public class StringStuff3
{
  public static void main (String[]args)
  {
    String input = JOptionPane.showInputDialog("Enter a String");
    String uInput = "";
    
    for (int i=0; i < input.length(); i++)
    {
      if (input.charAt(i) == ' ' )
      {
        System.out.print("_" + input.charAt(i));
      }
      
      else //it is a space
      {
        uInput = uInput + input.charAt(i);
        
      }
    
    }//end for loop
    System.out.print(uInput);
  }
}