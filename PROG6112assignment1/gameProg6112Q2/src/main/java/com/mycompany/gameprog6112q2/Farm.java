/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */

//inheriting the building class
public class Farm extends building
{
    private int foodProduce;
    
    public Farm()
    {
        //cost of building a farm
        super("Farm", 50);
        
        //produce 10 food per turn
        this.foodProduce = 10;
    }
    
    @Override
    public void produce(Town town)
    {
        town.addResource("Food", foodProduce);
        System.out.println("Farm produced" + foodProduce + "food.");
    }
}
