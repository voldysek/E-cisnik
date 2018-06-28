/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e.cisnik;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author voldy
 */
public class TableTest {

    /**
     * Test of getTable method, of class Table.
     */
    @Test
    public void testGetTable() {
        System.out.println("getTable");
        Table t = new Table(5);
        assertEquals(5, t.getTable());
        fail("The test case is a prototype.");
    }

}
