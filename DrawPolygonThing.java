public class DrawPolygonThing
{
  public static void main(String[]args)
  {
    GraphicsFrame gf = new GraphicsFrame();
    Aircraft ac = new Aircraft(100, 200);
    
    gf.add(ac);
  }
}