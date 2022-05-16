package com.geerd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.app.Medewerker;
import com.app.Pad;
import com.app.Vulplanning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VulplanningTest {

    RepeatingTestScanner rescanner;
    Medewerker testMedewerker;
    // private TestScanner testScanner;

    @BeforeEach
    public void init(){
        testMedewerker = new Medewerker("Geerd", 3);
        //testScanner = new TestScanner();
        rescanner = new RepeatingTestScanner();
    }

    @AfterEach
    public void clear(){
        rescanner.clear();
    }  
    
    @Test
    public void testMaakVulplanning(){
        Pad.padInter.setVulnorm(10);                             //A
        Pad.padInter.setAantalDozen(10);                        //B
        testMedewerker = new Medewerker("Geerd", 3);    //C
    assertEquals(true, Vulplanning.checkPlanning());         // 1 1 1
        Medewerker.MedewerkerList.clear();
    assertEquals(false, Vulplanning.checkPlanning());        // 1 1 0
        testMedewerker = new Medewerker("Geerd", 3);
        Pad.padInter.setAantalDozen(0);
    assertEquals(false, Vulplanning.checkPlanning());        // 1 0 1
        Pad.padInter.setVulnorm(0);
        Pad.padInter.setAantalDozen(10);
    assertEquals(false, Vulplanning.checkPlanning());        // 0 1 1
    
        Pad.padInter.setVulnorm(0);
    assertEquals(false, Vulplanning.checkPlanning());        // 0 0 1
        Pad.padInter.setVulnorm(10);
        Medewerker.MedewerkerList.clear();
    assertEquals(false, Vulplanning.checkPlanning());         // 1 0 0
        Pad.padInter.setVulnorm(0);
        Pad.padInter.setAantalDozen(10);
    assertEquals(false, Vulplanning.checkPlanning());         // 0 1 0
    }
}
