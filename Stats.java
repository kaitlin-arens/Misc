public class Stats
{
  public static double mean(double[]x)
  {
    double sum = 0;
    
    for (int i = 0;i<x.length;i++)
    {
      sum = sum + x[i];
    }
    
    return sum/x.length;
  }
  
  public static double max(double[]x)
  {
    double maximum = x[0];
    
    for(int i = 1; i < x.length; i++)
    {
      if(x[i] > maximum)
      {
        maximum = x[i];
      }
    }
    return maximum;
  }
}