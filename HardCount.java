public class HardCount//recursion
{
  public static void rCount(int i)
  {
    if (i == 0)//base case
    {
      return;
    }
    
    else//smaller caller
    {
      System.out.println(i);
      rCount(i-1);
    }
  }//return
  
  public static int factorial(int n)
  {
    if (n == 0)
    {
      return 1;
    }
    
    else
    {
      return n * factorial(n-1);
    }
  }
  
  public static void main (String[]args)
  {
    rCount(5);
    System.out.println(factorial(3));
  }
}