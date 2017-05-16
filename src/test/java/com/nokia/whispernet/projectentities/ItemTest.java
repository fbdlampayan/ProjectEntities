/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nokia.whispernet.projectentities;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lampayan
 */
public class ItemTest {
    
    @Test
    public void testItemIfEqual() {
        Item item = new Item();
        item.setId(1L);
        item.setName("FBDL");
        
        Item anotherItem = new Item();
        anotherItem.setId(1L);
        anotherItem.setName("FBDL");
        
        assertEquals(item, anotherItem);
    }
    
    @Test
    public void testItemInASet() {
        Item a = new Item();
        a.setId(1L);
        a.setName("A");
        
        Item b = new Item();
        b.setId(1L);
        b.setName("A");
        
        HashSet<Item> mySet = new HashSet<>();
        mySet.add(a);
        mySet.add(b);
        
        assertTrue(mySet.size() == 1);
    }
    
}
