package com.geerd;

import com.app.Medewerker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class VulplanningTest {

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
}
