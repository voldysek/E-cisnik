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
public interface MealListInterface {

    /**
     * Metoda, pomocí které se přidá jídlo do seznamu.
     * @param meal Jídlo, které se přidává do seznamu.
     */
    public void addToMealList(Meal meal);

    /**
     * Metoda, která vypíše celý list na obrazovku.
     */
    public void listMealList();
}
