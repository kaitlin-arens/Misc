import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SingleLinkListTest.
 *
 * @author  Tim McGowen
 * @version 9/20/2015 - version includes comments
 */
public class SingleLinkListTest
{
    /**
     * Default constructor for test class SingleLinkListTest
     */
    public SingleLinkListTest()
    {
    }

    /**
     * Test constructor
     */
    @Test
    public void testSingleLinkListConstructor()
    {
        SingleLinkList sll = new SingleLinkList();
        assertEquals(0, sll.size());
    }
    
    /**
     * Test toString
     */
    @Test
    public void testToString1()
    {
        SingleLinkList sll = new SingleLinkList();
        assertEquals("engine", sll.toString());
    }
    
    //* Remove when you are ready to test add to front
    @Test
    public void testAddOneToFront()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        sll.addBoxcarToFront(bc1);
        assertEquals("engine->first", sll.toString());
        assertEquals(1, sll.size());
    }

    @Test
    public void testAddTwoToFront()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        Boxcar bc2 = new Boxcar("second");
        sll.addBoxcarToFront(bc1);
        sll.addBoxcarToFront(bc2);
        assertEquals("engine->second->first", sll.toString());
        assertEquals(2, sll.size());
    }

    @Test
    public void testAddFifteenToFront()
    {
        SingleLinkList sll = new SingleLinkList();
        for (int i = 1; i < 16; i++)
        {
            Boxcar bc = new Boxcar(i + "");
            sll.addBoxcarToFront(bc);
        }
        assertEquals("engine->15->14->13->12->11->10->9->8->7->6->5->4->3->2->1", sll.toString());
        assertEquals(15, sll.size());
    }
    //Remove when you are ready to test add to front */
    
    //* Remove this comment when you are ready to test add to end
    @Test
    public void testAddOneToEnd()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        sll.addBoxcarToEnd(bc1);
        assertEquals("engine->first", sll.toString());
        assertEquals(1, sll.size());
    }
    
    @Test
    public void testAddTwoToEnd()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        Boxcar bc2 = new Boxcar("second");
        sll.addBoxcarToEnd(bc1);
        sll.addBoxcarToEnd(bc2);
        assertEquals("engine->first->second", sll.toString());
        assertEquals(2, sll.size());
    }
    
    @Test
    public void testAddFifteenToEnd()
    {
        SingleLinkList sll = new SingleLinkList();
        for (int i = 1; i < 16; i++)
        {
            Boxcar bc = new Boxcar(i + "");
            sll.addBoxcarToEnd(bc);
        }
        assertEquals("engine->1->2->3->4->5->6->7->8->9->10->11->12->13->14->15", sll.toString());
        assertEquals(15, sll.size());
    }
    //Remove this comment when you are ready to test add to end */
    
    //* Remove this comment when you are ready to test remove from front
    @Test
    public void testRemoveFromFront()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        Boxcar bc2 = new Boxcar("second");
        sll.addBoxcarToFront(bc1);
        sll.addBoxcarToEnd(bc2);
        assertEquals("engine->first->second", sll.toString());
        assertEquals(2, sll.size());
        sll.removeBoxcarFromFront();
        assertEquals("engine->second", sll.toString());
        assertEquals(1, sll.size());
        sll.removeBoxcarFromFront();
        assertEquals("engine", sll.toString());
        assertEquals(0, sll.size());
    }
    //Remove this comment when you are ready to test remove from front */
    
    //* Remove this comment when you are ready to test remove from end
    @Test
    public void testRemoveFromEnd()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        Boxcar bc2 = new Boxcar("second");
        sll.addBoxcarToFront(bc1);
        sll.addBoxcarToEnd(bc2);
        assertEquals("engine->first->second", sll.toString());
        assertEquals(2, sll.size());
        sll.removeBoxcarFromEnd();
        assertEquals("engine->first", sll.toString());
        assertEquals(1, sll.size());
        sll.removeBoxcarFromEnd();
        assertEquals("engine", sll.toString());
        assertEquals(0, sll.size());
    }
    //Remove this comment when you are ready to test remove from end */
    
    //* Remove this comment when all adds and removes work
    @Test
    public void testAssortedAddsRemoves()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("first");
        Boxcar bc2 = new Boxcar("second");
        Boxcar bc3 = new Boxcar("third");
        sll.addBoxcarToFront(bc1);
        sll.addBoxcarToEnd(bc2);
        sll.addBoxcarToEnd(bc3);
        assertEquals("engine->first->second->third", sll.toString());
        assertEquals(3, sll.size());
        sll.removeBoxcarFromEnd();
        sll.addBoxcarToFront(bc3);
        assertEquals("engine->third->first->second", sll.toString());
        assertEquals(3, sll.size());
        sll.removeBoxcarFromEnd();
        sll.addBoxcarToFront(bc2);
        assertEquals("engine->second->third->first", sll.toString());
        assertEquals(3, sll.size());
        sll.removeBoxcarFromEnd();
        sll.addBoxcarToFront(bc1);
        assertEquals("engine->first->second->third", sll.toString());
        assertEquals(3, sll.size());
        sll.removeBoxcarFromEnd();
        assertEquals("engine->first->second", sll.toString());
        assertEquals(2, sll.size());
        sll.removeBoxcarFromFront();
        assertEquals("engine->second", sll.toString());
        assertEquals(1, sll.size());
        sll.removeBoxcarFromEnd();
        assertEquals("engine", sll.toString());
        assertEquals(0, sll.size());
    }
    
    @Test
    public void testRemoveFromEnds()
    {
        SingleLinkList sll = new SingleLinkList();
        for (int i = 1; i < 16; i++)
        {
            Boxcar bc = new Boxcar(i + "");
            sll.addBoxcarToFront(bc);
        }
        assertEquals("engine->15->14->13->12->11->10->9->8->7->6->5->4->3->2->1", sll.toString());
        assertEquals(15, sll.size());
        sll.removeBoxcarFromFront();
        sll.removeBoxcarFromEnd();
        assertEquals("engine->14->13->12->11->10->9->8->7->6->5->4->3->2", sll.toString());
        assertEquals(13, sll.size());
        sll.removeBoxcarFromFront();
        sll.removeBoxcarFromEnd();
        sll.removeBoxcarFromFront();
        assertEquals("engine->12->11->10->9->8->7->6->5->4->3", sll.toString());
        assertEquals(10, sll.size());
        sll.removeBoxcarFromEnd();
        sll.removeBoxcarFromFront();
        sll.removeBoxcarFromEnd();
        sll.removeBoxcarFromFront();
        sll.removeBoxcarFromEnd();
        assertEquals("engine->10->9->8->7->6", sll.toString());
        assertEquals(5, sll.size());
        for (int i = 0; i < 5; i++)
            sll.removeBoxcarFromEnd();
        assertEquals("engine", sll.toString());
        assertEquals(0, sll.size());
    }
    //Remove this comment when all adds and removes work */

    @Test
    public void testTailPointer1()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("ATE1");
        Boxcar bc2 = new Boxcar("ATE2");
        Boxcar bc3 = new Boxcar("ATE3");

        // This should have set tail pointer correctly
        sll.addBoxcarToEnd(bc1);
        assertEquals(1, sll.size());
        assertEquals("engine->ATE1", sll.toString());

        // Did we correctly set the tail pointer above to add to the end?
        sll.addBoxcarToEnd(bc2);
        assertEquals(2, sll.size());
        assertEquals("engine->ATE1->ATE2", sll.toString());

        // This should have set the tail pointer correctly
        sll.removeBoxcarFromEnd();
        assertEquals(1, sll.size());
        assertEquals("engine->ATE1", sll.toString());
        
        // Did we correctly set the tail pointer above to add to the end?
        sll.addBoxcarToEnd(bc3);
        assertEquals(2, sll.size());
        assertEquals("engine->ATE1->ATE3", sll.toString());
    }

    @Test
    public void testTailPointer2()
    {
        SingleLinkList sll = new SingleLinkList();
        Boxcar bc1 = new Boxcar("ATE1");
        Boxcar bc2 = new Boxcar("ATE2");
        Boxcar bc3 = new Boxcar("ATE3");

        // Should set tail pointer correctly
        sll.addBoxcarToFront(bc1);
        assertEquals(1, sll.size());
        assertEquals("engine->ATE1", sll.toString());

        // Did we correctly set the tail pointer above to add to the end?
        sll.addBoxcarToEnd(bc2);
        assertEquals(2, sll.size());
        assertEquals("engine->ATE1->ATE2", sll.toString());

        // This should not change the tail pointer
        sll.removeBoxcarFromFront();
        assertEquals(1, sll.size());
        assertEquals("engine->ATE2", sll.toString());

        // Should see that tail pointer is still correctly positioned
        sll.addBoxcarToEnd(bc3);
        assertEquals(2, sll.size());
        assertEquals("engine->ATE2->ATE3", sll.toString());

        // Removing all boxcars from front should set tail pointer to null
        sll.removeBoxcarFromFront();
        assertEquals(1, sll.size());
        assertEquals("engine->ATE3", sll.toString());
        sll.removeBoxcarFromFront();
        assertEquals(0, sll.size());
        assertEquals("engine", sll.toString());
        
        // Did we correctly set the tail pointer above to add to the end?
        sll.addBoxcarToEnd(bc3);
        assertEquals(1, sll.size());
        assertEquals("engine->ATE3", sll.toString());
    }
}
