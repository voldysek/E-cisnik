/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e.cisnik;

import java.util.ArrayList;

/**
 *
 * @author voldy
 */
public class MealManagementServiceMock extends ArrayList<Meal> implements MealManagementService {

    public MealManagementServiceMock() {
        //ArrayList<Meal>meallist = new ArrayList<>(); 

        //new ArrayList<Meal>;
    }

    @Override
    public void addMeal(Meal meal) {

        this.add(meal);

    }

    @Override
    public void listMeals() {

        //vypis celeho listu do gui
        for (int i = 0; i < this.size(); i++) {
            //neco (meallist.get(i);)
            //vypis polozky do gui

        }

    }

}
