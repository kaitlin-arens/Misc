import java.util.Scanner;

public class Wing
{
  private String n; //name
  private double b; //wing span, m
  private double c; //wing chord, m 
  private double v; //velocity, m/s
  private double rho;//air density
  private double cl;//lift coefficient
  private double cd;
  private double area;
  
  public Wing ( String pn, double pb, double pc, double pv, double pr, double pcl, double pcd, double pa)
  {
  
   n = pn;
   b = pb;
   c = pc;
   v = pv;
   rho = pr;
   cl = pcl;
   cd = pcd;
   area = pa;
  }
  
  
  // accessors
  public String getn(){return n;}
  public double getb(){return b;}
  public double getc(){return c;}
  public double getv(){return v;}
  public double getRho(){return rho;}
  public double getcl(){return cl;}
  public double getcd(){return cd;}
  public double getArea(){return area;}
  

  
  
  public double lift()
  {
   return 0.5 * rho * Math.pow( v , 2) * cl * area;
  }
  
  public double drag()
  {
  return 0.5 * cd * v * v * area * rho;
  }
  
 public static void main (String[] args)
 {
  //public Wing (String proj, double pb, double pc, double pv, double pr, double pcl, double pcd, double pa)
  Wing myWing = new Wing("wing",10,1.5,23.15,1.255,1.4,1,1);
  
  System.out.println("Lift:" + myWing.lift());
  System.out.println("Drag:" + myWing.drag());
 }

}