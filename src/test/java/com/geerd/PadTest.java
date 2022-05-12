package com.geerd;

import com.app.Pad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PadTest {

    @Test
    public void testcheckVracht(){
        Pad.padDiepvries.setAantalDozen(10);
        assertEquals(true, Pad.checkVracht());
        Pad.padDiepvries.setAantalDozen(0);
        assertEquals(false, Pad.checkVracht());
    }

    @Test
    public void testcheckVulnorm(){
        Pad.padDiepvries.setVulnorm(10);
        assertEquals(true, Pad.checkVulnorm());
        Pad.padDiepvries.setVulnorm(0);
        assertEquals(false, Pad.checkVulnorm());
    }
    
}
