import java.util.*;

public class Postfix
{
  private String expression;
  
  public Postfix(String e)
  {
    expression = e;
  }
  
  public double eval()
  {
    String[] tokens = expression.split("\\s+");
    Stack stk = new Stack ();
    
    for(String token: tokens)
    {
      if ( isNumber(token))
      {
        stk.push( Double.parseDouble(token));
      }
      
      else if (isOperator(token))
      {
        //pop, pop, apply op, push result
        double y = (double) stk.pop();
        double x = (double) stk.pop();
        double pv = 0;
        
        switch(token)
        {
          case "+":
          pv = x + y;
          break;
          
          case "-":
          pv = x - y;
          break;
          
          case "*":
          pv = x * y;
          break;
          
          case "/":
          pv = x / y;
          break;
        }
        
        stk.push(pv);
      }
      
      else
      {
        //error
        System.out.println("Input Error: " + token);
        System.exit(0);
      }
    }//end for loop
    
    return (double)stk.pop();
  }
  
  public boolean isOperator(String po)
  {
    char cpo = po.charAt(0);
    return cpo=='+'|| cpo=='-'|| cpo=='*' || cpo=='/';
  }
  
  public boolean isNumber(String pn)
  {
    return Character.isDigit(pn.charAt(0));
  }
  
  public static void main (String[]args)
  {
    Postfix pf = new Postfix("20.5 8 + 6 *");
    System.out.println(pf.eval());
  }
}