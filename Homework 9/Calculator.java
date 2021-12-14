/*
 * Calculator - take an infix string, change to postfix notation and evaluate.
 * Kaitlin Arens
 * 3/25/18
 */
public class Calculator
{
  // Take an infix arithmetic expression and return a postfix arithmetic expression.
  public String infixToPostfix(String infixNotation)
  {
     GenericList stack = new GenericList();
     Parse infixString = new Parse(infixNotation);
     String token;
     String postfix = "";
     //System.out.println("You entered: " + stack.toString());
     
     while(true)
     {
	// 1. Read a token from the infix expression.
     
       token = infixString.getNextToken();
       if(token == "")
       {
         break;
       }
       //System.out.println("Token: " + token);
       
	// 2. If the token is a number, then add it to the postfix expression.
      if(!infixString.isOperator(token))
      {
        postfix = postfix + token + " ";
        //System.out.println("Postfix: " + postfix);
        continue;
      }
     
	// 3. If the stack is empty or contains a left parenthesis on top,
	//    push the token onto the stack
   
     if(stack.isEmpty() || stack.peek().equals("("))
     {
       stack.push(token);
       //System.out.println("Stack: " + stack.toString());
       continue;
     }

	// 4. If the token is a left parenthesis, push it on the stack.
      if(token.equals("("))
      {
       stack.push(token);
       //System.out.println("Stack: " + stack.toString());
       continue;
      }
      
      
   
	// 5. If the token is a right parenthesis, pop the stack and add value
	//    to the postfix expression. Repeat until you see a left parenthesis.
	//    Discard the left and right parenthesis.
   
      if(token.equals(")"))
      {
        postfix = postfix + stack.pop() + " ";
        
        //System.out.println("Postfix33: " + postfix);
        //System.out.println("Stack.size 33: " + stack.size());
        //System.out.println("Peek33: " + stack.peek());
        
        while(!stack.isEmpty() && !stack.peek().equals("("))
        {
          postfix = postfix + " " + stack.pop();
          //System.out.println("Postfix22: " + postfix);
          //System.out.println("Stack.size22: " + stack.size());
        }
        
        stack.pop();//pop left parenthesis
        
        //System.out.println("Postfix44: " + postfix);
        //System.out.println("Stack.size 44: " + stack.size());
        //System.out.println("Peek44: " + stack.peek());
        
        continue;
      }

	// 6. If the token is ^ (which is right associative) and
	//    has equal precedence as top of stack
	//    ( the only operation of equal precedence is ^ ), push it onto the stack.
	//    If the token is not ^ and has higher precedence as top of stack,
	//    push it on the stack.
     if(token.equals("^"))
     {
       stack.push(token);
       //System.out.println("Stack4444: " + stack.toString());
       continue;
     }
   

	// 7. If the token has precedence equal to or less than the top of stack,
	//    pop the stack and add value to the postfix expression.
	//    Then test the token against the new top of stack and repeat.
	//    Push the token onto the stack.
      while(!stack.isEmpty() && infixString.lessThanEqualTo(token,(String)stack.peek()))
      {
        postfix = postfix + stack.pop() + " ";
      }
      
      stack.push(token);
      //System.out.println("Postfix: " + postfix);
      //System.out.println("Stack: " + stack.toString());
    }
	// 8. At the end of the expression,
	//    pop all values from the stack and add to the output queue.
   while(!stack.isEmpty())
   {
     postfix = postfix + stack.pop() + " ";
   }
   return postfix;
  }


  public int evaluatePostfix(String postfixNotation)
  {
    GenericList stack = new GenericList();
    Parse newPostfixNotation = new Parse(postfixNotation);
  
    int returnValue = 0;
    int operand1;
    int operand2;
    String token;
    
    //System.out.println("Start:  " + newPostfixNotation);
    //System.out.println("Start2:  " + postfixNotation);
    //System.out.println("Size: " + newPostfixNotation.size());
    
    //System.out.println("Postfix: " + postfix);
    
    token = newPostfixNotation.getNextToken();
    
    // 4. Repeat from step 1 until expression is completed.
    while(token != "")
    {
       //token = newPostfixNotation.getNextToken();
       
       // 2. When you see an operator, pop the first operand off the stack
	    //and place to the right of the operator. Pop the next operand
	    //off the stack and place to the left of the operator.
       
       //System.out.println("What is the token " + token);
       //System.out.println("Is it an operator? " + newPostfixNotation.isOperator(token));
       
       if(newPostfixNotation.isOperator(token))
       {
         //System.out.println("OPP: " + (String)stack.peek());
         //System.out.println("OPP int " + Integer.parseInt((String)stack.peek()));
         
         operand2 = Integer.parseInt((String)stack.pop());
         operand1 = Integer.parseInt((String)stack.pop());
         
         //System.out.println("Op1 " + operand1);
         //System.out.println("Op2 " + operand2);
         
         // 3. Perform the operation and push the result onto the stack.
         
         if(token.equals("+"))
         {
           returnValue = operand1 + operand2;
         }
         
         else if(token.equals("-"))
         {
           returnValue = operand1 - operand2;
         }
         
         else if(token.equals("*"))
         {
           returnValue = operand1 * operand2;
         }
         
         else if(token.equals("/"))
         {
           returnValue = operand1/operand2;
         }
         
         else if(token.equals("^"))
         {
           returnValue = (int)Math.pow(operand1, operand2);
           //System.out.println("CARROT " + returnValue);
         }
         
         stack.push(Integer.toString(returnValue));
         
         //System.out.println("This is return value " + returnValue + " operand1 "+ operand1 + " operand2 " + operand2 + " token " + token);
         //System.out.println("New String " + stack.toString());
       }
       
       // 1. Push operands onto the stack.

       else
       {
         stack.push(token);
         //System.out.println("pushing" + stack.toString());
       }
       
       //System.out.println("Token 22: " + token);
       
       //System.out.println("Operand1: " + operand1);
       //operand2 = newPostfixNotation.getNextToken();
       //System.out.println("Operand2: " + operand2);
       token = newPostfixNotation.getNextToken();
       
    }
	
	// 5. The value at the top of the stack is the result.
   //System.out.println();
   return Integer.parseInt((String)stack.pop());
  }

  public static void main(String[] args)
  {
    String infixNotation;
    String postfixNotation;
    int calculatedValue;

    // Take the first argument from the command line as a string with
    // infix notation.
    if (args.length == 0)
    {
      System.out.println("You need to enter an infix notation string");
      System.exit(1);
    }

    infixNotation = args[0];
    System.out.println("You entered: " + infixNotation);
    postfixNotation = new Calculator().infixToPostfix(infixNotation);
    //System.out.println("This is mine: " + postfixNotation);
    System.out.println("Postfix notation: " + postfixNotation);
    calculatedValue = new Calculator().evaluatePostfix(postfixNotation);
    System.out.println("Result of evaluation: " + calculatedValue);
  }
}
