/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */
public class resource 
{
    private String name; 
    private int quantity;
    
    //constructor with parameters
    public resource(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void addQuantity(int cost)
    {
        this.quantity += cost;
    }
    
    public void subtractQuantity(int cost)
    {
        this.quantity -= cost;
    }
}
