public class LotsOfLoopsB
{
  public static void main (String[]args)
  {
    double powers = 0;
    
    for (double c=0; c <= 20; powers = Math.pow(2, c))
    {
      powers = Math.pow(2,c); 
      c++;
      System.out.println(powers);
    }
    
    
  }
}