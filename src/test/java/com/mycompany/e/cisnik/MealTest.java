/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e.cisnik;

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
        Meal m = new Meal("polevka", 10, 1);
        assertEquals("polevka", m.getMealName());

        fail("Test se nepovedl " + m.getMealName());
    }

    /**
     * Test of getPrice method, of class Meal.
     */
    @org.junit.Test
    public void testGetPrice() {
        Meal m = new Meal("polevka", 10, 1);
        assertEquals((int) 10, m.getPrice());

        fail("Test se nepovedl " + m.getPrice());
    }

    /**
     * Test of getAvailability method, of class Meal.
     */
    @org.junit.Test
    public void testGetAvailability() {
        Meal m = new Meal("polevka", 10, 1);
        assertEquals(1, m.getAvailability());

        fail("Test se nepovedl " + m.getAvailability());
    }

    /**
     * Test of setAvailability method, of class Meal.
     */
    @org.junit.Test
    public void testSetAvailability() {
        Meal m = new Meal("polevka", 10, 1);
        m.setAvailability(0);

        assertEquals(0, m.getAvailability());

        fail("Test se nepovedl " + m.getAvailability());
    }

}
