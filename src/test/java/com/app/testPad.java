package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPad {

    public Pad inter;

    @BeforeEach
    public void start(){
        inter = new Pad("Internationaal", 60, 0);
        Pad.setAantalDozen(0, 0);
        Pad.setVulnorm(0, 60);
    }
    @AfterEach
    public void end(){
        Pad.setAantalDozen(0, 0);
        Pad.setVulnorm(0, 60);
    }

    @Test
    void testGetAantalDozenString() {
        assertEquals("0", Pad.getAantalDozenString(0));
    }

    @Test
    void testGetVulnormString() {
        assertEquals("60", Pad.getVulnormString(0));
    }

    @Test
    void testSetAantalDozen() {
        Pad.setAantalDozen(0, 10);
        assertEquals(10, Pad.PadList.get(0).getAantalDozen());
    }

    @Test
    void testSetVulnorm() {
        Pad.setVulnorm(0, 10);
        assertEquals(10, Pad.PadList.get(0).getVulnorm());
    }
}
