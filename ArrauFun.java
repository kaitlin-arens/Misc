import java.util.Random;
import java.util.Arrays;


public class ArrauFun
{ 
  public static void arrayPrint(int[]a)
  {
    int i = 0;
    for (int e: a)
    {
      System.out.println("index: " + i + "  " + e);
      
      i++;
    }
    
    System.out.println();//blank line on display
  }
  
  public static void main (String[]args)
  {
    Random rangen = new Random();
    int[] nums;
    
    nums = new int[10];
    
    arrayPrint(nums);
    
    for (int i=0; i<nums.length; i++)
    {
      nums[i] = rangen.nextInt(100);
    }
    
    arrayPrint(nums);
    
    //sort array
    Arrays.sort(nums);
    arrayPrint(nums);
    
    //replace 5th element with 1000
    nums[5] = 1000;
    arrayPrint(nums);
    
    nums[nums.length - 1] = nums[0] + nums[1];
    arrayPrint(nums);
    
    nums[0] = 5;
    nums[nums[0]] = nums[8];
    arrayPrint(nums);
    
    int sum = 0;
    for (int bigLarry : nums)//colon is a seperator, required syntax..... advanced for loop
    {
      sum = sum + bigLarry;
    }
    
    System.out.println("sum = " + sum);
  }//end main
}