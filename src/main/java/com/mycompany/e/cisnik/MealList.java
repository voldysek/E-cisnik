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
public class MealList extends ArrayList<Meal> implements MealListInterface {

     public MealList() {
        //meallist = new ArrayList<>(); 

        //new ArrayList<Meal>;
    }

    @Override
    public void addToMealList(Meal meal) {

        this.add(meal);

    }

    @Override
    public void listMealList() {

        //vypis celeho listu do gui
        for (int i = 0; i < this.size(); i++) {
            //neco (meallist.get(i);)
            //vypis polozky do gui

        }

    }

}
