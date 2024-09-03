/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */

//importations
import java.util.ArrayList;


public class Town 
{
    private ArrayList<resource> resources;
    private ArrayList<building> buildings;
    
    public Town()
    {
        resources = new ArrayList<>();
        buildings = new ArrayList<>();
        resources.add(new resource("Food", 100));
        resources.add(new resource("Materials", 50));
        resources.add(new resource("Credit", 200));
    }
    
    public void addResource(String name, int cost)
    {
        for(resource resource : resources)
        {
            if(resource.getName().equalsIgnoreCase(name))
            {
                resource.addQuantity(cost);
                return;
            }
        }
        resources.add(new resource(name,cost));
    }
    
    public boolean spendResource(String name, int cost)
    {
        for(resource resource : resources)
        {
            if(resource.getName().equalsIgnoreCase(name)&&resource.getQuantity() >= cost)
            {
                resource.subtractQuantity(cost);
                return true;
            }
        }
        return false;
    }
    
    public void addBuilding(building building)
    {
        buildings.add(building);
    }
    
    public void produceAll()
    {
        for(building building : buildings)
        {
            building.produce(this);
        }
    }
    
    public void showResources()
    {
        System.out.println("\nCurrent Resources:");
        for(resource resource : resources)
        {
            System.out.println(resource.getName() + ":" + resource.getQuantity());
        }
    }
}
