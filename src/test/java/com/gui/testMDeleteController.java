package com.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.LeaderBoard;
import com.app.Medewerker;

public class testMDeleteController {

    Medewerker testMedewerker;
    MDeleteController test;

    @BeforeEach
    public void start(){
        testMedewerker = new Medewerker("test", 3);
        test = new MDeleteController();
    }
    @AfterEach
    public void end(){
        LeaderBoard.medewerkers.clear();
        LeaderBoard.planningMedewerkers.clear();
    }

    @Test
    public void testPcheck() {
        assertEquals(0, LeaderBoard.planningMedewerkers.size());
        LeaderBoard.planningMedewerkers.add(testMedewerker);
        assertEquals(1, LeaderBoard.planningMedewerkers.size());
        test.Pcheck(0);
        assertEquals(0, LeaderBoard.planningMedewerkers.size());
    }
}
