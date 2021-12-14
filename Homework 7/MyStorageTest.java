import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GenericList implementing MyStorage interface
 *
 * @author  Tim McGowen
 * @version 9/20/2015 - version includes comments
 */
public class MyStorageTest
{
    /*
     * Default constructor for test class GenericListTest
     */
    public MyStorageTest()
    {
    }

    /**
     * Test constructor
     */
    @Test
    public void testGenericList()
    {
      GenericList<String> storage = new GenericList<String>();
      assertEquals(0, storage.size());
    }
    
    /**
     * Test toString
     */
    @Test
    public void testToString1()
    {
        GenericList<String> storage = new GenericList<String>();
        assertEquals("", storage.toString());
    }
    
    //* Remove when you are ready to test add
    @Test
    public void testAddOne()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.add("first");
        assertEquals("first", storage.toString());
        assertEquals(1, storage.size());
    }

    @Test
    public void testAddTwo()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.add("first");
        storage.add("second");
        assertEquals("first, second", storage.toString());
        assertEquals(2, storage.size());
    }

    @Test
    public void testAddFifteen()
    {
        GenericList<String> storage = new GenericList<String>();
        for (int i = 1; i < 16; i++)
        {
            storage.add(i + "");
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", storage.toString());
        assertEquals(15, storage.size());
    }
    //Remove when you are ready to test add to front */

    //* Remove when you are ready to test get
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetEmptyStorage()
    {
        GenericList<String> storage = new GenericList<String>();
        String data = storage.get(0);
    }

    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetInvalidIndex()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.add("first");
        String data = storage.get(3);
    }

    @Test
    public void testGetOneItem()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.add("first");    
        String data = storage.get(0);
        assertEquals(data, "first");
    }

    @Test
    public void testGetItemFromMiddle()
    {
        GenericList<String> storage = new GenericList<String>();
        for (int i = 1; i < 15; i++)
        {
            storage.add(i + "");
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14", storage.toString());
        assertEquals(14, storage.size());
        assertEquals("7", storage.get(6));
    }
    //Remove when you are ready to test get */

    //* Remove when you are ready to test set
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testSetEmptyStorage()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.set(0, "first");
    }

    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testSetInvalidIndex()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.add("first");
        storage.set(-1, "will fail");
    }

    @Test
    public void testSetOneItem()
    {
        GenericList<String> storage = new GenericList<String>();
        storage.add("first");    
        assertEquals("first", storage.get(0));
        storage.set(0, "FIRST");
        assertEquals("FIRST", storage.get(0));
    }

    @Test
    public void testSetItemFromMiddle()
    {
        GenericList<String> storage = new GenericList<String>();
        for (int i = 1; i < 15; i++)
        {
            storage.add(i + "");
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14", storage.toString());
        assertEquals(14, storage.size());
        assertEquals("7", storage.get(6));
        storage.set(6, "777");
        assertEquals("777", storage.get(6));
    }
    //Remove when you are ready to test set */
    
    //* Remove when you are ready to test clear
    @Test
    public void testClearEmptyList()
    {
      GenericList<String> storage = new GenericList<String>();
      storage.clear();
      assertEquals(0, storage.size());
    }

    @Test
    public void testClearNonEmptyList()
    {
      GenericList<String> storage = new GenericList<String>();
      for (int i = 1; i < 101; i++)
      {
        storage.add(i + "");
      }
      assertEquals(100, storage.size());
      storage.clear();
      assertEquals(0, storage.size());
    }
    //Remove when you are ready to test clear */
}
