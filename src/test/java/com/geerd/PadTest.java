package com.geerd;

import com.app.Pad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PadTest {

    @Test
    public void testCheckVracht(){
        Pad.padInter.setAantalDozen(10);
        assertEquals(true, Pad.checkVracht());
        Pad.padInter.setAantalDozen(0);
        assertEquals(false, Pad.checkVracht());
    }

    @Test
    public void testCheckVulnorm(){
        Pad.padInter.setVulnorm(10);
        assertEquals(true, Pad.checkVulnorm());
        Pad.padInter.setVulnorm(0);
        assertEquals(false, Pad.checkVulnorm());
    }
    
}
