/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */
public class market extends building
{
    private int moneyProduction;
    
    public market()
    {
        //cost of building a market is 75 vBucks
        super("Market", 75);
        
        //produces 15 money per turn
        this.moneyProduction = 15;
    }
    
    @Override
    public void produce(Town town)
    {
        town.addResource("Money", moneyProduction);
        System.out.println("Market produced" + moneyProduction + "vBucks.");
    }
}
