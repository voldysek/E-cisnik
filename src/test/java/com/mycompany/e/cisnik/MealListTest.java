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
public class MealListTest {

    /**
     * Test of addToMealList method, of class MealList.
     */
    @Test
    public void testAddToMealList() {
        System.out.println("addToMealList");
        Meal meal = null;
        MealList instance = new MealList();
        instance.addToMealList(meal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listMealList method, of class MealList.
     */
    @Test
    public void testListMealList() {
        System.out.println("listMealList");
        MealList instance = new MealList();
        instance.listMealList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
