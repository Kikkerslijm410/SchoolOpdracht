package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testMedewerker {
    
    Medewerker testMedewerker;

    @BeforeEach
    public void start(){
        testMedewerker = new Medewerker("test", 3);
    }
    @AfterEach
    public void end(){
        LeaderBoard.medewerkers.clear();
    }

    @Test
    public void testNaam(){
        assertEquals("test", testMedewerker.getNaam());
        testMedewerker.setNaam("Lucas Clavel");
        assertEquals("Lucas Clavel", testMedewerker.getNaam());
    }

    @Test
    public void testRank(){
        assertEquals(0, testMedewerker.getRank());
        testMedewerker.setRank(2);
        assertEquals(2, testMedewerker.getRank());
    }

    @Test
    public void testWerktijd(){
        assertEquals(180, testMedewerker.getWerktijd());
        testMedewerker.setWerktijd(120);
        assertEquals(120, testMedewerker.getWerktijd());
        testMedewerker.setWerktijd(4);
        assertEquals(240, testMedewerker.getWerktijd());
    }
}
