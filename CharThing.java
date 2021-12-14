import javax.swing.*;

public class CharThing
{
  public static void main(String [] args)
  {
    String input;
    char c;
    String message;
    
    input = JOptionPane.showInputDialog("Enter a letter");
    input = input.toUpperCase();
    
    c = input.charAt(0);
    
    if (MyString.vowelCheck (c))
    {
      message = "vowel";
    }
    
    else if (c >= 'A'&& c <='Z')
    {
      message = "consonant";
    }
    
    else
    {
      message = "That wasn't a letter. Try again.";
    }
    
    System.out.println(message);
    
  }
}