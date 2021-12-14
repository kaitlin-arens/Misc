import javax.swing.*;

public class LotsOfLoopsC
{
  public static void main (String[]args)
  {
    int sum = 0;
    int a = 0;
    int b = 0;
    String n = JOptionPane.showInputDialog("Enter a starting number:");
    String m = JOptionPane.showInputDialog("Enter an ending numner:");
    
    a = Integer.parseInt(n);
    b = Integer.parseInt(m);
    
    for (int c = a; c <= b; c = c++)
    { 
      
      c = a++;
     
      if ( c%2 == 1)//number odd if true
      {
        sum = sum + c;
      }
    }
    
    System.out.println( sum );
  }
}