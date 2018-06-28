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
public class MealList implements MealListInterface{

    private ArrayList<Meal> meallist;

    public MealList() {

        //new ArrayList<Meal>;
    }

    @Override
    public void addToMealList(Meal meal) {

        meallist.add(meal);

    }

    @Override
    public void listMealList() {

        //vypis celeho listu do gui
        for (int i = 0; i < meallist.size(); i++) {
            //neco (meallist.get(i);)
            //vypis polozky do gui

        }

    }

}
