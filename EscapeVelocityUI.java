import javax.swing.JOptionPane;

public class EscapeVelocityUI
{
  public static void main (String[]args)
  {
  
   double mass;
   double radius;
   String input;
   EscapeVelocity body;
  
   input = JOptionPane.showInputDialog("Enter Object Mass in kg: ");
   mass = Double.parseDouble(input);
   input = JOptionPane.showInputDialog("Enter Object radius in m: ");
   radius = Double.parseDouble(input);
   
   body = new EscapeVelocity (mass, radius);
   
   System.out.println(body.vEscape());
   

  }

}