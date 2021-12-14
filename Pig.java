import java.awt.Color;

public class Pig
 {
  private String name;
  private double weight;
  private int age; //months
  private int x,y; //pig position
  private Color color;
 } 
  public Pig (String n, double w, int a, int px, int py, Color c)
  {
    //field = parameter
    name = n;
    weight = w;
    age = a;
    x = px;
    y = py;
    color = c;
  }
  
 //accessors and mutators
 
 //general methods
 public void makeNoise()
 {
  // use java sound player to make pig noise
  System.out.println (name + " is oinking.");
 }
 
 public void eat()
 {
 //animate pig eating
  System.out.println (name + " is eating.");
 }
 
 public double value( double pricePerPound )
 {
 return weight * pricePerPound;
 }
 
 public static void main (String [] args)
 {
  Pig p = new Pig ("Big Larry", 350, 3, color.PINK)
  
  p.makeNoise();
  p.eat();
  
  Sytem.out.print
 }
 
}
