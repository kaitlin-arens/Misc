import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Test the Parse class
 */
public class ParseTest
{ 
  @Test
  public void testConstructor()
  {
    Parse b = new Parse("1st 2nd 3d 4th");
    assertEquals(4, b.size());
  }

  @Test
  public void testDisplayTokens()
  {
    Parse b = new Parse("1st 2nd 3rd 4th");
    assertEquals("1st:2nd:3rd:4th", b.toString());
  }

  @Test
  public void testDisplayTokens2()
  {
    Parse b = new Parse("1st 2nd  3rd   4th");
    assertEquals("1st:2nd:3rd:4th", b.toString());
  }

  @Test
  public void testDisplayTokens3()
  {
    Parse b = new Parse("");
    assertEquals("No Tokens", b.toString());
  }

  @Test
  public void testDisplayTokens4()
  {
    Parse b = new Parse("abc");
    assertEquals("abc", b.toString());
  }

  @Test
  public void testGetNextToken1()
  {
    Parse b = new Parse("");
    assertEquals("", b.getNextToken());
  }

  @Test
  public void testGetNextToken2()
  {
    Parse b = new Parse("123");
    assertEquals("123", b.getNextToken());
    assertEquals("", b.getNextToken());
  }

  @Test
  public void testGetNextToken3()
  {
    Parse b = new Parse("123   +  78  xxx");
    assertEquals("123", b.getNextToken());
    assertEquals("+", b.getNextToken());
    assertEquals("78", b.getNextToken());
    assertEquals("xxx", b.getNextToken());
    assertEquals("", b.getNextToken());
  }

  /* Cannot test as method is private
  @Test
  public void testTokenPrecedence1()
  {
    String token;

    Parse b = new Parse(") + - * / ^ (");
    token = b.getNextToken();
    assertEquals(1, b.tokenPrecedence(token)); // )
    token = b.getNextToken();
    assertEquals(2, b.tokenPrecedence(token)); // +
    token = b.getNextToken();
    assertEquals(2, b.tokenPrecedence(token)); // -
    token = b.getNextToken();
    assertEquals(3, b.tokenPrecedence(token)); // *
    token = b.getNextToken();
    assertEquals(3, b.tokenPrecedence(token)); // /
    token = b.getNextToken();
    assertEquals(4, b.tokenPrecedence(token)); // ^
    token = b.getNextToken();
    assertEquals(5, b.tokenPrecedence(token)); //(
    token = b.getNextToken();
    assertEquals("", b.getNextToken());
  }
  */

  @Test
  public void testLessThanEqualTo1()
  {
    Parse b = new Parse("");
    assertEquals(true, b.lessThanEqualTo("+", "+"));
    assertEquals(true, b.lessThanEqualTo("+", "-"));
    assertEquals(true, b.lessThanEqualTo("-", "-"));
    assertEquals(true, b.lessThanEqualTo("-", "*"));
    assertEquals(true, b.lessThanEqualTo("*", "*"));
    assertEquals(true, b.lessThanEqualTo("*", "/"));
    assertEquals(true, b.lessThanEqualTo("/", "/"));
    assertEquals(true, b.lessThanEqualTo("/", "^"));
    assertEquals(true, b.lessThanEqualTo("^", "^"));
    assertEquals(true, b.lessThanEqualTo("^", "^"));
  }

  @Test
  public void testLessThanEqualTo2()
  {
    Parse b = new Parse("");
    assertEquals(false, b.lessThanEqualTo("*", "-"));
    assertEquals(false, b.lessThanEqualTo("^", "/"));
  }

  @Test
  public void testIsOperator1()
  {
    String token;

    Parse b = new Parse("( ^ * / + - ) -1 123 abc");
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(true, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(false, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(false, b.isOperator(token));
    token = b.getNextToken();
    assertEquals(false, b.isOperator(token));
  }
}
