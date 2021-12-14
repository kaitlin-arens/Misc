import java.util.Scanner;

public class CircleArea
{
  public static void main (String [] args)
  {
  double radius;
  double area;
  Scanner kb = new Scanner (System.in);
  
  System.out.print("Enter radius:");
  radius = kb.nextDouble ();
  
  area = Math.PI*Math.pow(radius,2);
  
  System.out.println("Area = "+ area);
  }//end main


}