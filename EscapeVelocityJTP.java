import javax.swing.JOptionPane;

public class EscapeVelocityJTP
{
  public static void main(String[]args)
  {
  final double G = 6.67E-11;
  double M = 2.2E14;//kg
  double R = 5500;//m
  double vEscape = 0;
  String input;
  
  input = JOptionPane.showInputDialog("Enter Object Mass in kg: ");
  M = Double.parseDouble(input);
  input = JOptionPane.showInputDialog("Enter Object radius in m: ");
  R = Double.parseDouble(input);
  
  vEscape = Math.sqrt(2*((G*M)/R));
  
  System.out.println(vEscape);
  
    if (vEscape > 3.13)
    {
    System.out.println("You are going to be lost in space until aliens find you!");
    }
  
    else if (vEscape < 3.13)
    {
    System.out.println("You are still stuck on the comet...How did you get there anyway?");
    }
   
    else 
    {
    System.out.println("You are floating in space!");
    }
  
  }
}