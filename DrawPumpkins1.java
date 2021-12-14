import java.awt.*;

public class DrawPumpkins1
{
  public static void main(String[]args)
  {
    GraphicsFrame gf = new GraphicsFrame();
    
    Pumpkin p = new Pumpkin (100, 175, 75, 75);//(x,y,w,h)
    Pumpkin p1 = new Pumpkin (400, 200, 100, 75);
    Pumpkin p2 = new Pumpkin (500, 300, 200, 150);
    Pumpkin p3 = new Pumpkin (200, 350, 100, 100); 
    
    
    gf.add(p);
    gf.add(p1);
    gf.add(p2);
    gf.add(p3);
  }
}