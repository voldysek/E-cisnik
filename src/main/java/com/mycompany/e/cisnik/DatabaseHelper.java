/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e.cisnik;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Langi
 */
public class DatabaseHelper {
    
    /* Definování proměnné třídy Connection */
    protected Connection conn;
    
    
    
    /**
     * Konstruktor. Slouží k připojení k MySQL serveru před JDBC.
     * @param dt MealServiceImplementation
     */
    public DatabaseHelper()
    {
        
        try
        {
            String driver = "com.mysql.jdbc.Driver"; //Do proměnné typu String uloží driver
            String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7244887?"; //Do proměnné typu String uloží url k databázi
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, "sql7244887", "HYudjNBdUy"); //Do proměnné typu Connection uloží připojení k databázi
            if(conn.isClosed()) //Podmínka proběhne, pokud je připojení zavřeno
            {
                conn = (Connection) DriverManager.getConnection(url, "sql7244887", "HYudjNBdUy"); //Znovu se připojí k databázi
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    /**
     * Načte všechna data z databáze Jídel podle typu
     * @param typeNumber Typ jídla
     * @return Kolekce jídel
     */
    public ArrayList<Meal> nactiDataZDatabaze(int typeNumber) 
    {
        ArrayList<Meal> meals = new ArrayList<>();
        Meal j = null;
        try
        {
            final String query = "SELECT * from Jidla WHERE Typ = ?";
            final PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query); 
            ps.setInt(1, typeNumber);
            final ResultSet result = ps.executeQuery();
        
            while(result.next())
            {
                
                String name = result.getString(2);
                int price = result.getInt(5);
                
                if(typeNumber != 5)
                {
                int type = result.getInt(8);
                String description = result.getString(4);
                
                String allergens = result.getString(6);
                String quantity = result.getString(7);
                
                InputStream binaryStream = result.getBinaryStream(3);
                BufferedImage bf = ImageIO.read(binaryStream);
                Image picture = SwingFXUtils.toFXImage(bf, null);
            
                j = new Meal(name, description, allergens, quantity, price, type, picture);
                }
                else
                {
                    j = new Meal(name, price);
                }
                meals.add(j);
            }
            ps.close();
            result.close();
        
        }
        catch(Exception ex)
        {
            System.out.println("Chyba pri prenosu z databaze.");
        }
        return meals;
    }
    
    
    
}
