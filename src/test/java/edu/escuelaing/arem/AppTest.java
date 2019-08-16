package edu.escuelaing.arem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 * @author Sergio Ruiz
 */
public class AppTest {
	
	/**
	 * Test correct add of a new value to LinkedList
	 */
    @Test
    public void addToLinkedList() {
        LinkedList lK = new LinkedList();
        lK.append(10);
        assertEquals(10, lK.getHead().getData(), 0.00001);
    }
    
    /**
     * Test that first value added is always the head of LinkedList
     */
    @Test
    public void headIsTheFirstAddedValue() {
    	LinkedList lK = new LinkedList();
    	lK.append(8);
    	lK.append(15);
    	assertEquals(8, lK.getHead().getData(), 0.00001);
    }
    
    /**
     * Test correct value deleted from LinkedList
     */
    @Test
    public void deleteElement() {
    	LinkedList lK = new LinkedList();
    	lK.append(13);
    	lK.delete(13);
    	assertNull(lK.getHead());
    }
    
    /**
     * Test if to delete a nonexistent element LinkedList's head is null 
     */
    @Test
    public void deleteElementOnEmptyLinkedList() {
    	LinkedList lK = new LinkedList();
    	lK.delete(0);
    	assertNull(lK.getHead());
    }
    
}
