/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gameprog6112q2;

/**
 *
 * @author Huawei i5 CCM
 */

//imports 

import java.util.Scanner;

public class GameProg6112Q2 
{
    public static void main(String[] args)
    {
        GameProg6112Q2 game = new GameProg6112Q2();
        game.start();
    }
    
    //creating and declaring a scanner
    private static Scanner scan = new Scanner(System.in);
    private Town town;
    
    public GameProg6112Q2()
    {
        //constructor
        town = new Town();
    }
    
    public void start()
    {
        System.out.println("*******WELCOME TO EMPIRE MANAGEMENT GAME********");
        System.out.print("____LET THE GAMES BEGIN____");
        
        //boolean to enter the gamer into the menu to start Empire.
        boolean stillRunning = true;
        
        while (stillRunning)
        {
            town.showResources();
            System.out.println("\n [SELECT AN ACTION]");
            System.out.println("1. Build a Farm. (Credit: 50 vBucks)");
            System.out.println("2. Build a Factory. (Credit: 100 vBucks)");
            System.out.println("3. Build a Market. (Credit: 75 vBucks)");
            System.out.println("4. Finish Turn");
            System.out.println("5. Quit Game");
            
            int option = scan.nextInt();
            
            switch(option)
            {
                case 1: constructBuilding(new Farm());
                break;
                
                case 2: constructBuilding(new factory());
                break;
                
                case 3: constructBuilding(new market());
                break;
                
                case 4: town.produceAll();
                break;
                
                case 5: stillRunning = false;
                        System.out.println("Leaving Game. Goodbye!");
                        break;
                        
                default: System.out.println("Invalid Choice. Please try again.");
                        
            }
        }
    }
    
    
    private void constructBuilding(building building)
    {
        if(town.spendResource("Credit", building.getBuildCost()))
        {
            town.addBuilding(building);
            System.out.println(building.getName() + "Successfully built!");
        } 
        else
        {
            System.out.println(":( Insufficient credit to build " + building.getName() + ".");
        }
    }
}
