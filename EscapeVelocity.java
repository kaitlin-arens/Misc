public class EscapeVelocity
{
  private final double G = 6.67E-11;
  private double M;//kg
  private double R;//m
  
  public EscapeVelocity()//default constructor, no parameters
  {
   //Earth data
   M = 5.9E24;
   R = 6.37E6;
  }

  public EscapeVelocity(double m, double r)//parameter (dies)is assigned to the field (lives on)
  {
  //Earth data
   M = m;
   R = r;
  }
  
  public double getM(){return M;}
  public double getR(){return R;}
  
  
  public double vEscape()
  {
    return Math.sqrt(2*((G*M)/R));
  }

  public static void main(String[]args)
  {
   EscapeVelocity earth = new EscapeVelocity();
   System.out.println(earth.vEscape() );
  }
}