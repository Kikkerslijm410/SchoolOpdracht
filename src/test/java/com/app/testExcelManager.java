package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testExcelManager {

    Medewerker testMedewerker;
    Medewerker testMedewerker2;
    Medewerker testMedewerker3;
    Pad inter;
    Pad potjes;
    Pad fris;

    @BeforeEach
    public void start(){
        testMedewerker = new Medewerker("test", 3);
        testMedewerker2 = new Medewerker("test2", 3);
        testMedewerker3 = new Medewerker("test3", 3);
        inter = new Pad("Internationaal", 60, 0);
        potjes = new Pad("Potjes", 60, 40);
        fris = new Pad("Frisdrank", 60, 50);
    }
    @AfterEach
    public void end(){
        LeaderBoard.medewerkers.clear();
        Pad.PadList.clear();
    }

    @Test
    public void testGetMedewerker() {
       LeaderBoard.planningMedewerkers.add(testMedewerker);
        assertEquals("test", ExcelManager.getMedewerker(true));
        LeaderBoard.planningMedewerkers.add(testMedewerker2);
        LeaderBoard.planningMedewerkers.add(testMedewerker3);
        assertEquals("test2", ExcelManager.getMedewerker(false));
        assertEquals("test3", ExcelManager.getMedewerker(false));
        LeaderBoard.planningMedewerkers.clear();
        assertEquals("-1", ExcelManager.getMedewerker(false));
        ExcelManager.getal = 0;
    }

    @Test
    public void testGetVultijd() {
        assertEquals("0", ExcelManager.getVultijd(0));
        Pad.setAantalDozen(0, 60);
        assertEquals("1", ExcelManager.getVultijd(0));
    }

    @Test
    public void testGetVultijd2() {
        assertEquals("0", ExcelManager.getVultijd2(0));
        Pad.setAantalDozen(0, 60);
        assertEquals("1", ExcelManager.getVultijd(0));
    }

    @Test
    public void testVrachtTotaal() {
        assertEquals("90", ExcelManager.vrachtTotaal());
        Pad.PadList.clear();
        assertEquals("-1", ExcelManager.vrachtTotaal());
    }

    @Test
    public void testVultijdTotaal() {
        assertEquals("90.0", ExcelManager.vultijdTotaal()); 
        Pad.PadList.clear();
        assertEquals("-1", ExcelManager.vrachtTotaal());
    }
}
