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
public class Main {

    public static void main(String[] args) {

        Meal jidlo = new Meal("Rizek", 100, 1);
        MealList mlist = new MealList();
        mlist.add(jidlo);

        Meal jidlo2;
        jidlo2 = mlist.get(0);
        System.out.println(jidlo2.getPrice());
    }

}
