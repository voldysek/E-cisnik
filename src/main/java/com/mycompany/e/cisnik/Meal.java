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
public class Meal {
    private String mealName;
    private int price;
    private int availability;
    
    Meal(String mealName, int price, int availability){
    this.mealName = mealName;
    this.price = price;
    this.availability = availability;
 
    }

    public String getMealName() {
        return mealName;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    
    
    
}
