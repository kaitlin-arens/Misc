import java.awt.*;

public class DrawDonuts
{
  public static void main(String[]args)
  {
   GraphicsFrame gf = new GraphicsFrame();
   
   //int px, int py, int od, int id, Color c, boolean s
   Donut d1 = new Donut(100, 100, 200, 75, Color.PINK, true);
   Donut d2 = new Donut(500, 400, 150, 50, Color.BLUE, true);
   
   
   gf.add(d1);
   gf.add(d2);
  }

}