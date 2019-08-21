package edu.escuelaing.arem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
        lK.append(10.0);
        assertEquals(10.0, lK.getHead().getData(), 0.00001);
    }
    
    /**
     * Test that first value added is always the head of LinkedList
     */
    @Test
    public void headIsTheFirstAddedValue() {
    	LinkedList lK = new LinkedList();
    	lK.append(8.0);
    	lK.append(15.0);
    	assertEquals(8, lK.getHead().getData(), 0.00001);
    }
    
    /**
     * Test if to delete a nonexistent element LinkedList's head is null 
     */
    @Test
    public void deleteElementOnEmptyLinkedList() {
    	LinkedList lK = new LinkedList();
    	lK.delete(0.0);
    	assertNull(lK.getHead());
    }

    /**
     * Test if method mean calculates the correct value
     */
    @Test
    public void meanTest(){
        LinkedList lK = new LinkedList();
        lK.append(14.0);
        lK.append(7.5);
        lK.append(3.3);
        lK.append(5.8);
        lK.append(9.9);
        assertEquals(8.1, App.mean(lK), 0.00001);
    }

    /**
     * Test if method standarDev calculates the correct value
     */
    @Test
    public void standarDevTest(){
        LinkedList lK = new LinkedList();
        lK.append(14.0);
        lK.append(7.5);
        lK.append(3.3);
        lK.append(5.8);
        lK.append(9.9);
        assertNotEquals(App.standardDev(lK), 3.65, 0.00001);
    }
    
}
