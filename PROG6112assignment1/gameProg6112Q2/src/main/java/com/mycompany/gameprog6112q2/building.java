/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */
public abstract class building 
{
    private String name;
    private int buildCost;
    
    //constructor with parameteres
    public building(String name, int buildCost)
    {
        this.name = name;
        this.buildCost = buildCost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getBuildCost()
    {
        return buildCost;
    }
    
    public abstract void produce(Town town);
}
