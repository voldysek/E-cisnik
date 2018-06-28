/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e.cisnik;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author voldy
 */
public class MealTest {

    /**
     * Test of getMealName method, of class Meal.
     */
    @org.junit.Test
    public void testGetMealName() {
        System.out.println("getMealName");
        Meal instance = null;
        String expResult = "";
        String result = instance.getMealName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Meal.
     */
    @org.junit.Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Meal instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailability method, of class Meal.
     */
    @org.junit.Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        Meal instance = null;
        int expResult = 0;
        int result = instance.getAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailability method, of class Meal.
     */
    @org.junit.Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        int availability = 0;
        Meal instance = null;
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
