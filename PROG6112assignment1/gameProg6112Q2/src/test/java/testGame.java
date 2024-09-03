/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Huawei i5 CCM
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.gameprog6112q2.Town;
import com.mycompany.gameprog6112q2.Farm;
import com.mycompany.gameprog6112q2.factory;
import com.mycompany.gameprog6112q2.market;
import com.mycompany.gameprog6112q2.resource;
//import com.mycompany.gameprog6112q2.Factory;
public class testGame
{
    
    //test class for the town and its functions
     private Town town;
     private resource resource;
     
    //initialising Town object prior to each test
    @Before
    public void setUp() {
        town = new Town();
    }

    @Test
    public void testInitialResources() {
        assertEquals(100, town.getResourceQuantity("Food"));
        assertEquals(50, town.getResourceQuantity("Materials"));
        assertEquals(200, town.getResourceQuantity("Money"));
    }

    @Test
    public void testAddResource() {
        town.addResource("Food", 20);
        assertEquals(120, town.getResourceQuantity("Food"));
    }

    @Test
    public void testSpendResourceSuccess() {
        boolean result = town.spendResource("Credit", 50);
        assertTrue(result);
        assertEquals(150, town.getResourceQuantity("Credit"));
    }

    @Test
    public void testSpendResourceFailure() {
        boolean result = town.spendResource("Credit", 500);
        assertFalse(result);
        assertEquals(200, town.getResourceQuantity("Money"));
    }

    @Test
    public void testBuildFarm() {
        Farm farm = new Farm();
        town.addBuilding(farm);
        farm.produce(town);
        assertEquals(110, town.getResourceQuantity("Food"));
    }

    @Test
    public void testBuildFactory() {
        factory factory = new factory();
        town.addBuilding(factory);
        factory.produce(town);
        assertEquals(55, town.getResourceQuantity("Materials"));
    }

    @Test
    public void testBuildMarket() {
        market market = new market();
        town.addBuilding(market);
        market.produce(town);
        assertEquals(215, town.getResourceQuantity("Credit"));
    }

    @Test
    public void testMultipleProductions() {
        Farm farm = new Farm();
        factory factory = new factory();
        market market = new market();

        town.addBuilding(farm);
        town.addBuilding(factory);
        town.addBuilding(market);

        town.produceAll();

        assertEquals(110, town.getResourceQuantity("Food"));
        assertEquals(55, town.getResourceQuantity("Materials"));
        assertEquals(215, town.getResourceQuantity("Credit"));
    }
    
}
