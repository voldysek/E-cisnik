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
public class Table_Waiter {
    private int table;
    private int price;
    
    public Table_Waiter(int table){
    this.table = table;
   
    
    }

public void deleteTable(){

//DROP * FROM Orders WHERE this.getTable()==table

}
public void listTable(){

//SELECT nazev FROM Objednavky WHERE TABLE==table


}

public int tablePrice(){

    
    //while(true){
//price = SELECT price FROM Objednavky WHERE TABLE==table
//prochazet tabulku po jednom radku a ulozit do price, mozna bude potreba v te tabulce stejne zavest id, nevim jak se to da prochazet po jednom
   
this.price= this.price+this.price;
 //}

return price;
}

    public int getTable() {
        return table;
    }






    
    
    
    
}
