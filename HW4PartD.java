import javax.swing.*;

public class HW4PartD
{
   public static void main (String[]args)
   {
     String input = JOptionPane.showInputDialog("Enter a String");
     String reverse = "";
     
     for(int i = input.length()-1; i >= 0; i--)
     {
       reverse = reverse + input.charAt(i);
     }
     System.out.println(input);//original string
     System.out.println(reverse);
     
     System.out.println(input.equals(reverse));
   }
}