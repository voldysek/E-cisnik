/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e.cisnik;

/**
 *
 * @author voldy
 */
public interface MealManagementService {

    /**
     * Metoda, pomocí které se přidá jídlo do seznamu.
     *
     * @param meal Jídlo, které se přidává do seznamu.
     */
    public void addMeal(Meal meal);

    public void listMeals();
}
