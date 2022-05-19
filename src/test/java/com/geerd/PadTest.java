package com.geerd;

import com.app.Medewerker;
import com.app.Pad;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PadTest {

    RepeatingTestScanner rescanner;
    Medewerker testMedewerker;
    // private TestScanner testScanner;

    @BeforeEach
    public void init(){
        testMedewerker = new Medewerker("Geerd", 3);
        //testScanner = new TestScanner();
        rescanner = new RepeatingTestScanner();
    }

    @AfterEach
    public void clear(){
        rescanner.clear();
    }  

    @Test
    public void testVulnormMethod(){
        rescanner.intlist.add(10);
        assertEquals(10, Pad.vulnormMethod(rescanner));
    }

    @Test
    public void testVrachtMethod(){
        rescanner.intlist.add(1);
        assertEquals(1, Pad.vrachtMethod(rescanner));
    }
}
