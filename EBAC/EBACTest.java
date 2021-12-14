public class EBACTest
{
  public static void main (String[]args)
  {
    //double sd, double wt, double dp, char g
    EBAC ebac1 = new EBAC(2, 140, 1, 'f');
    System.out.println(ebac1.estimatedBAC());
    
  }
}