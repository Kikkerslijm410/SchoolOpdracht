package com.geerd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.app.Vliegtuig;

import org.junit.jupiter.api.Test;

public class VliegtuigTest {

    @Test
    public void testToestemming(){
        Vliegtuig Cessna5 = new Vliegtuig(1001, 51, false);
        assertEquals(false, Cessna5.checkToestemming());
        Vliegtuig Cessna6 = new Vliegtuig(999, 50, true);
        assertEquals(true, Cessna6.checkToestemming());
        Vliegtuig Cessna7 = new Vliegtuig(1000, 51, true);
        assertEquals(true, Cessna7.checkToestemming());
        Vliegtuig Cessna8 = new Vliegtuig(1001, 49, false);
        assertEquals(false, Cessna8.checkToestemming());
    }

    @Test
    public void testCheckBedrag1(){
        assertEquals(150, Vliegtuig.checkBedrag1(999, 2, false, false));
        assertEquals(900, Vliegtuig.checkBedrag1(999, 1, true, false));
        assertEquals(121, Vliegtuig.checkBedrag1(999, 1, false, true));
        assertEquals(750, Vliegtuig.checkBedrag1(1000, 2, false, false));
        assertEquals(1300, Vliegtuig.checkBedrag1(1000, 1, true, false));
        assertEquals(605, Vliegtuig.checkBedrag1(1000, 1, false, true));
        assertEquals(3750, Vliegtuig.checkBedrag1(5000, 2, false, false));
        assertEquals(3300, Vliegtuig.checkBedrag1(5000, 1, true, false));
        assertEquals(3025, Vliegtuig.checkBedrag1(5000, 1, false, true));

        assertEquals(100, Vliegtuig.checkBedrag1(999, 1, false, false));
        assertEquals(500, Vliegtuig.checkBedrag1(1000, 1, false, false));
        assertEquals(2500, Vliegtuig.checkBedrag1(5000, 1, false, false));
    }

    @Test
    public void testCheckBedrag2(){
        Vliegtuig Cessna1 = new Vliegtuig(999);
        assertEquals(100, Cessna1.checkBedrag2());
        Vliegtuig Cessna2 = new Vliegtuig(1000);
        assertEquals(500, Cessna2.checkBedrag2());
        Vliegtuig Cessna3 = new Vliegtuig(4999);
        assertEquals(500, Cessna3.checkBedrag2());
        Vliegtuig Cessna4 = new Vliegtuig(5000);
        assertEquals(2500, Cessna4.checkBedrag2());
    }
}
