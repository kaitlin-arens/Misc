import java.util.Arrays;

public class FunWithArrays
{
  public static void main (String[]args)
  {
    int[] grades = {93, 28, 87, 52, 90, 48};
    int sum = 0;
    int swap = 0;
    
    System.out.println("Array Contents:");
    
    
    for (int i = 0; i < grades.length; i++)
    {
      System.out.println(i + ": " + grades [i]);
    }
    
    System.out.println();
    
    System.out.println("Sum Array Contents:");
    
    for (int i = 0; i < grades.length; i++)
    {
      sum = sum + grades[i];
    }
    
    System.out.println("Sum = " + sum);
    System.out.println("Average =" + sum/grades.length);
    System.out.println();
    
    /*System.out.println("Fill Array:");
    
    for (int i = 0; i < grades.length; i++)
    {
      grades [i] = 5;
      System.out.println(i + ": " + grades [i]);
    }
    */
    System.out.println();
    System.out.println("Times Two:");
    
    
    for (int i = 0; i < grades.length; i++)
    {
      grades [i] = grades[i]*2;
      System.out.println(i + ": " + grades [i]);
    }
    System.out.println();
    
    System.out.println("Sort Array");
    
    //Arrays.sort(grades);
    for (int h = 0; h < grades.length-1; h++)
    {
       for (int i = 0; i < grades.length-1; i++)
       {
         if(grades[i] > grades [i+1])
         {
           swap = grades [i];
           grades[i] = grades [i+1];
           grades [i+1] = swap;
         }
       }
    }
    
    System.out.println("Array Contents:");
    for (int i = 0; i < grades.length; i++)
    {
      System.out.println(i + ": " + grades [i]);
    }
  }
}