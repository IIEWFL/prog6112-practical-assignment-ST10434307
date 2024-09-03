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
    
    
    
     /*Code attribution
       This code was adapted from stackoverflow
    https://stackoverflow.com/questions/20390694/managing-resources-in-a-game
      By Brian Tompsett  11 December 2015, accessed 3 September 2024
    */
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
    
//method created from test class
    public Object getResourceQuantity(String food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
