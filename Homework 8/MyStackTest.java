import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest
{
  /*
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
    {
    }

    /**
     * Test constructor
     */
    @Test
    public void testMyStack()
    {
      GenericList<String> storage = new GenericList<String>();
      assertEquals(0, storage.size());
      
      assertEquals(true, storage.isEmpty());
    }
    
    @Test
    public void testMyStack2()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      int number = stack.size();
      assertEquals(1, number);
      assertEquals(false, stack.isEmpty());
      stack.push("Second");
      assertEquals(2, stack.size());
      assertEquals("Second", stack.peek());
      String s = stack.pop();
      assertEquals("Second", s);
      assertEquals(1, stack.size());
      assertEquals("ABC", stack.peek());
      
    }
    
   @Test
    public void stackConstructorTest()
    {
      GenericList<String> stack = new GenericList<String>();
      assertEquals(0, stack.size());
      assertEquals(true, stack.isEmpty());
    }
    
    @Test
    public void stackPush1Test()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      
      int number = stack.size();
      assertEquals(1, number);
      assertEquals(false, stack.isEmpty());
      String s = stack.peek();
      assertEquals("ABC", s);
      
      //String toString = stack.toString();
      //System.out.println(stack.toString());
      assertEquals("top, ABC, bottom", stack.toString());
    }
    
    @Test
    public void stackPush2Test()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      stack.push("DEF");
      int number = stack.size();
      assertEquals(2, number);
      assertEquals(false, stack.isEmpty());
      String s = stack.peek();
      assertEquals("DEF", s);
      assertEquals("top, DEF, ABC, bottom", stack.toString());
    }
    
    @Test
    public void stackPop1Test()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      int number = stack.size();
      assertEquals(1, number);
      assertEquals(false, stack.isEmpty());
      String s = stack.pop();
      assertEquals("ABC", s);
      int number1 = stack.size();
      assertEquals(0, number1);
      assertEquals(true, stack.isEmpty());
      assertEquals("top, bottom", stack.toString());
    }
    
    @Test
    public void stackPop2Test()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      stack.push("DEF");
      int number = stack.size();
      assertEquals(2, number);
      assertEquals(false, stack.isEmpty());
      String s = stack.pop();
      assertEquals("DEF", s);
      int number1 = stack.size();
      assertEquals(1, number1);
      assertEquals(false, stack.isEmpty());
      assertEquals("top, ABC, bottom", stack.toString());
      String x = stack.pop();
      assertEquals("ABC", x);
      int number2 = stack.size();
      assertEquals(0, number2);
      assertEquals(true, stack.isEmpty());
      assertEquals("top, bottom", stack.toString());
    }
    
    @Test
    public void stackClearTest()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      stack.push("DEF");
      int number = stack.size();
      assertEquals(2, number);
      assertEquals(false, stack.isEmpty());
      stack.clear();
      int number1 = stack.size();
      assertEquals(0, number1);
      assertEquals(true, stack.isEmpty());
      assertEquals("top, bottom", stack.toString());
    }
    
    @Test
    public void testToString()
    {
      GenericList<String> stack = new GenericList<String>();
      stack.push("ABC");
      stack.push("DEF");
      assertEquals("top, DEF, ABC, bottom", stack.toString());
    }
}