public class LotsOfLoopsA
{
  public static void main (String[]args)
  {
    int sum = 0;
    
    for (int c=2; c <= 100; c = c + 2)
    {
      sum = sum + c;
    }
    
    System.out.println( sum );
    
  }



}