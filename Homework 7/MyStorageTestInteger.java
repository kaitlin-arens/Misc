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
public class MyStorageTestInteger
{
    /*
     * Default constructor for test class GenericListTest
     */
    public MyStorageTestInteger()
    {
    }

    /**
     * Test constructor
     */
    @Test
    public void testGenericList()
    {
      GenericList<Integer> storage = new GenericList<Integer>();
      assertEquals(0, storage.size());
    }
    
    /**
     * Test toString
     */
    @Test
    public void testToString1()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        assertEquals("", storage.toString());
    }
    
    //* Remove when you are ready to test add
    @Test
    public void testAddOne()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.add(1);
        assertEquals("1", storage.toString());
        assertEquals(1, storage.size());
    }

    @Test
    public void testAddTwo()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.add(44);
        storage.add(55);
        assertEquals(2, storage.size());
    }

    @Test
    public void testAddFifteen()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        for (int i = 0; i < 15; i++)
        {
            storage.add(i + 1);
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", storage.toString());
        assertEquals(15, storage.size());
    }
    //Remove when you are ready to test add to front */

    //* Remove when you are ready to test get
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetEmptyStorage()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        int data = storage.get(0);
    }

    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testGetInvalidIndex()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.add(1);
        int data = storage.get(3);
    }

    @Test
    public void testGetOneItem()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.add(2);    
        int data = storage.get(0);
        assertEquals(data, 2);
    }

    @Test
    public void testGetItemFromMiddle()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        for (int i = 0; i < 14; i++)
        {
            storage.add(i + 1);
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14", storage.toString());
        assertEquals(14, storage.size());
        assertEquals((Integer)7, storage.get(6));
    }
    //Remove when you are ready to test get */

    //* Remove when you are ready to test set
    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testSetEmptyStorage()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.set(0, 1);
    }

    @Test (expected=java.lang.ArrayIndexOutOfBoundsException.class)
    public void testSetInvalidIndex()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.add(1);
        storage.set(-1, 0);
    }

    @Test
    public void testSetOneItem()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        storage.add(11);    
        assertEquals(11, (int)storage.get(0));
        storage.set(0, 111);
        assertEquals(111, (int)storage.get(0));
    }

    @Test
    public void testSetItemFromMiddle()
    {
        GenericList<Integer> storage = new GenericList<Integer>();
        for (int i = 0; i < 14; i++)
        {
            storage.add(i + 1);
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14", storage.toString());
        assertEquals(14, storage.size());
        assertEquals(7, (int)storage.get(6));
        storage.set(6, 777);
        assertEquals(777, (int)storage.get(6));
    }
    //Remove when you are ready to test set */
    
    //* Remove when you are ready to test clear
    @Test
    public void testClearEmptyList()
    {
      GenericList<Integer> storage = new GenericList<Integer>();
      storage.clear();
      assertEquals(0, storage.size());
    }

    @Test
    public void testClearNonEmptyList()
    {
      GenericList<Integer> storage = new GenericList<Integer>();
      for (int i = 0; i < 100; i++)
      {
        storage.add(i + 1);
      }
      assertEquals(100, storage.size());
      storage.clear();
      assertEquals(0, storage.size());
    }
    //Remove when you are ready to test clear */
}
