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
public class MealListTest {

    /**
     * Test of addToMealList method, of class MealManagementServiceMock.
     */
    @Test
    public void testAddToMealList() {
        System.out.println("addToMealList");

        Meal m = new Meal("Rizek", 100, 1);
        MealManagementServiceMock ml = new MealManagementServiceMock();
        ml.addMeal(m);

        assertEquals("Rizek", ml.get(0).getMealName());

        fail("Test failture");
    }
}
