package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testLeaderBoard {

    Medewerker testMedewerker;

    @BeforeEach
    public void start(){
        testMedewerker = new Medewerker("test", 3);
    }
    @AfterEach
    public void end(){
        LeaderBoard.medewerkers.clear();
        LeaderBoard.planningMedewerkers.clear();
    }

    @Test
    public void testAddPlanningUsers() {
        assertEquals(0, LeaderBoard.planningMedewerkers.size());
        LeaderBoard.addPlanningUsers(1);
        assertEquals(1, LeaderBoard.planningMedewerkers.size());
        assertEquals("test", LeaderBoard.planningMedewerkers.get(0).getNaam());
    }
}
