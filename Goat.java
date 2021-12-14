import java.awt.*;

public class Goat implements Drawable
{
  private int x,y; //location in window
  private String name;
  
  public Goat(int px, int py, String n)
  {
   x=px;
   y=py;
   name=n;
  }
  
  public void move(int newX,int newY)
  {
   x=newX;
   y=newY;
  }
  
  public void draw(Graphics g)
  {
   g.drawRect(x,y,25,20);//body
   g.drawOval(x+25,y-5,10,10);//head
   g.drawString(name,x,y);
  }



} 