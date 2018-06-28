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
public interface TableInterface {

    /**
     * Metoda, která vymaže objednávku, která byla u určitého stolu.
     */
    public void deleteTable();

    /**
     * Metoda, která vypíše objednávku od určitého stolu.
     */
    public void listTable();

    /**
     * Metoda, která spočítá cenu objednaných jídel u daného stolu.
     * @return Návratová hodnota je cena.
     */
    public int tablePrice();

    /**
     * Metoda, která vrací hodnotu čísla stolu.
     * @return Číslo stolu.
     */
    public int getTable();
}
