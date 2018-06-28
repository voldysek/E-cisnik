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

<<<<<<< HEAD:src/main/java/com/mycompany/e/cisnik/MealManagementService.java
    public void addMeal(Meal meal);

    public void listMeals();
=======
    /**
     * Metoda, pomocí které se přidá jídlo do seznamu.
     * @param meal Jídlo, které se přidává do seznamu.
     */
    public void addToMealList(Meal meal);

    /**
     * Metoda, která vypíše celý list na obrazovku.
     */
    public void listMealList();
>>>>>>> abae0262420e316d05f1f3c8cd8ee8025ddbc470:src/main/java/com/mycompany/e/cisnik/MealListInterface.java
}
