public class BinaryToASCIIhex
{
  public static String b16toAH (int n)
  {
    final char[] ASCIIhex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
  
    int i = 0;
    String ahs =  "";
    
    for(int shift = 12; shift >= 0; shift = shift - 4)
    {
       i = n >>> shift; //create index 
       i = i & 0b1111;
       ahs = ahs + ASCIIhex[i];
       
    
    }
    return ahs;

  }
  
  public static void main(String[]args)
  {
    int j = 51900; //CABC
    System.out.println(b16toAH(j)); 
    
    j = 65535;//FFFF   
    System.out.println(b16toAH(j));
    
    j = 1;//0001
    System.out.println(b16toAH(j)); 
    
    j = 15;//000F
    System.out.println(b16toAH(j)); 
    
    j = 0;//0000
    System.out.println(b16toAH(j));  
  }
}