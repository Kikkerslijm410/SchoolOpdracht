package com.geerd;

import com.app.Pad;
import com.app.Vulplanning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VulplanningTest {

    @BeforeEach
    public void init(){
        Pad.padDiepvries.setAantalDozen(10);
        Pad.padDiepvries.setVulnorm(10);
    }

    @Test
    public void testcheckVracht(){
        assertEquals(false, Vulplanning.checkVracht());
    }

}
