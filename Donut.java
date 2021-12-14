import java.awt.*;
import java.util.Random;

public class Donut implements Drawable
{
  private int x,y;
  private int outsideDiameter;
  private int insideDiameter; //fields
  private Color color;
  private boolean sprinkles;
  
  public Donut (int px, int py, int od, int id, Color c, boolean s ) //constructor
    {
     x = px;
     y = py;
     outsideDiameter = od;
     insideDiameter = id;
     color = c;
     sprinkles = s;
    }
    
    public void draw (Graphics g)
    {
     int holeOffset = 0;
     Random rangen = new Random();
     int sox = rangen.nextInt(outsideDiameter); //sprinkle offset in the x direction
     int soy = rangen.nextInt(outsideDiameter); //sprinkle offset in the y direction
     
     g.setColor( color );
     g.fillOval(x,y, outsideDiameter, outsideDiameter);
     
     if (sprinkles)
     {
       g.setColor(Color.RED);
       g.fillRect(x + sox, y + soy, 5, 10);
     }
     
     g.setColor(Color.WHITE);
     
     holeOffset = outsideDiameter / 2 - insideDiameter / 2;
     g.fillOval(x + holeOffset, y + holeOffset, insideDiameter, insideDiameter);
    }//end draw
}