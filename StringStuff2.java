import javax.swing.*;

public class StringStuff2
{
  public static void main (String[]args)
  {
    String input = JOptionPane.showInputDialog("Enter a String");
    String caps = "";
    
    for (int i=1; i < input.length(); i+=2)
    {
      if (input.charAt(i) != ' ' )
      {
        System.out.println (i + ": " + input.charAt(i));
      }
      
      else //it is a space
      {
        System.out.println(i + "Space");
      }
    
    }//end for loop
  }
}