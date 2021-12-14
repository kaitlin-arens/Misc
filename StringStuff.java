import javax.swing.*;

public class StringStuff
{
  public static void main (String[]args)
  {
    String input = JOptionPane.showInputDialog("Enter a String");
    String caps = "";
    
    for (int i=0; i < input.length(); i++)
    {
      if( input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
      {
        caps = caps + input.charAt(i) + " ";
      }
    
    }//end for loop
    
    if (caps.length()>0)
    {
      System.out.println(caps);
    }
    
    else
    {
      System.out.println("No capital letters.");
    }
  }
}