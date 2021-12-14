import java.awt.*;

public class Aircraft implements Drawable
{
  private int x, y;
  private Polygon profile;
  
  public Aircraft (int px, int py)
  {
    x = px;
    y = py;
    
    profile = new Polygon();
    profile.addPoint(x, y);
    profile.addPoint(x+30, y-20);
    profile.addPoint(x,y+25);
    profile.addPoint(x-20,y);
  }
  
  public void draw(Graphics g)
  {
    g.fillPolygon(profile);
  }

}