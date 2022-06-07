package com.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.Pad;

public class testVulnormController {

    public Pad inter;

    @BeforeEach
    public void start(){
        inter = new Pad("Internationaal", 60, 0);
        Pad.setVulnorm(0, 60);
    }
    @AfterEach
    public void end(){
        Pad.setVulnorm(0, 60);
    }

    @Test
    void testReset() {
        Pad.setVulnorm(0, 10);
        assertEquals(10, Pad.PadList.get(0).vulnorm);
        VrachtController.setZero(2);
        assertEquals(0, Pad.PadList.get(0).vulnorm);
    }

    @Test
    void testStringToInt() {
        assertEquals(60, VulnormController.StringToInt(0, ""));
        Pad.setAantalDozen(0, 10);
        assertEquals(10, VulnormController.StringToInt(0, "10"));
    }
}
