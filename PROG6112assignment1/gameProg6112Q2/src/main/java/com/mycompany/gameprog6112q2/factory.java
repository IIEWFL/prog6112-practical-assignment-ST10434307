/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */

//factory class inherits building class
public class factory extends building
{
    private int materialProduction; 
    
    public factory()
    {
        //cost of building a factory is 100 vBucks
        super("Factory",100);
        
        //produces 5 materials per turn 
        this.materialProduction = 5;
    }
    
    @Override
    public void produce(Town town)
    {
        town.addResource("Materials", materialProduction);
        System.out.println("Factory produced" + materialProduction + "materials.");
    }
}



