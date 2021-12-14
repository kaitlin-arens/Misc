import javax.swing.*;

public class LoopsPartD
{
  public static void main ( String [] args )
  {
    String n = JOptionPane.showInputDialog("Enter a number:");
    int d = 0;
    int sum = 0;
    
    for( int i = 0; i <= n.length()-1; i ++)
    {
      //System.out.println(n.charAt(i));
      
      d = Character.digit(n.charAt( i ),10); //subtract the ascii offset
      
      if ( d%2 == 1)//number odd if true
      {
        sum = sum + d;
      }
      //System.out.println( d );
      
    }
    System.out.println(sum);
  }
}