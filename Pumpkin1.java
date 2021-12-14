import java.awt.*;

public class Pumpkin1 implements Drawable //Drawable is an interface not a class
{
  private int x,y;
  private int width;
  private int height;
  private Polygon profile;
  private Polygon profileZ;
  private Polygon profileA;
  private Polygon profileB;
  private Polygon profileC;
  public int getWidth(){return width;}
  public int getHeight(){return height;}
 
  
  public Pumpkin(int px, int py, int w, int h)
  {
   x = px;
   y = py;
   width = w;
   height = h; 
   
   profile = new Polygon();
   profile.addPoint(x + getWidth()/5, y + getHeight()*4/7);
   profile.addPoint(x + getWidth()/3, y + getHeight()*4/7);
   profile.addPoint(x + getWidth()/4, y + getHeight()*12/15);
   
   profileZ = new Polygon();
   profileZ.addPoint(x + getWidth() - getWidth()/5, y + getHeight()*4/7);
   profileZ.addPoint(x + getWidth() - getWidth()/3, y + getHeight()*4/7);
   profileZ.addPoint(x + getWidth() - getWidth()/4, y + getHeight()*12/15);
   
   profileA = new Polygon();
   profileA.addPoint(x + getWidth()/3, y + getHeight()*4/7);
   profileA.addPoint(x + getWidth()*18/35, y + getHeight()*4/7);
   profileA.addPoint(x + getWidth()*6/15, y + getHeight()*12/15);
   
   profileB = new Polygon();
   profileB.addPoint(x + getWidth()*18/35, y + getHeight()*4/7);
   profileB.addPoint(x + getWidth() - getWidth()/3, y + getHeight()*4/7);
   profileB.addPoint(x + getWidth()*9/15, y + getHeight()*12/15);
   
   profileC = new Polygon();
   profileC.addPoint(x + getWidth(), y + getHeight()/2);
   profileC.addPoint(x + getWidth(), y - getHeight()/2);
   profileC.addPoint(x + getWidth() + getWidth()/8, y + getHeight()/2);
  }
 
  public void draw(Graphics g)
  { 
    int xx = x + getWidth()/2;
    int yy = y + getHeight()/3;
    g.setColor(Color.GREEN);
    g.fillRect(xx-9,y-9,10,10);
    g.setColor(Color.ORANGE);
    g.fillOval(x, y, width, height);
    g.setColor(Color.BLACK);
    g.fillRect(x+getWidth()/3, yy, 10, 10);
    g.setColor(Color.BLACK);
    g.fillRect(x+getWidth()*2/3, yy, 10, 10);
    g.fillPolygon(profile);
    g.fillPolygon(profileZ);
    g.fillPolygon(profileA);
    g.fillPolygon(profileB);
    g.setColor(Color.RED);
    g.fillOval(x + getWidth()*8/35,y + getHeight()*11/15,10,20);
    g.setColor(Color.BLACK);
    g.fillRect(x + getWidth(), y + getHeight()/2, getWidth()/16, getHeight()/2);
    g.setColor(Color.GRAY);
    g.fillPolygon(profileC);
  }
}