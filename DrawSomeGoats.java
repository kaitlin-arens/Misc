import java.awt.Graphics;

public class DrawSomeGoats
{
  public static void main(String[]args)
  {
    GraphicsFrame gf = new GraphicsFrame();
    
    Goat g1 = new Goat(100,150,"Goat Larry");
    Goat g2 = new Goat(200,250,"Jeff");
    
    gf.add(g1);
    gf.add(g2);
  }
  
}