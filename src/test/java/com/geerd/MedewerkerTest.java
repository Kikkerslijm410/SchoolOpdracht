package com.geerd;

import com.app.Medewerker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MedewerkerTest {

    private RepeatingTestScanner rescanner;
    private Medewerker testMedewerker;
    private TestScanner testScanner;

    @BeforeEach
    public void init(){
        testMedewerker = new Medewerker("Geerd", 3);
        testScanner = new TestScanner();
        rescanner = new RepeatingTestScanner();
    }

    @AfterEach
    public void clear(){
        rescanner.clear();
    }  

    @Test
    public void testMedewerkerDelete(){
        String test = "";
        int userRemoveStudentChoice = 1;
        if (userRemoveStudentChoice > 0){
        Medewerker.MedewerkerList.remove(userRemoveStudentChoice-1);
        test = "gelukt";
        }else{
        test = "niet gelukt";
        }
        
        assertEquals("gelukt", test);
        assertNotEquals("niet gelukt", test);
    }

    @Test
    public void testMedewerkerAdd(){
        assertEquals("Geerd", Medewerker.MedewerkerList.get(Medewerker.MedewerkerList.size()-1).getNaam());
        assertNotEquals("Lucas", Medewerker.MedewerkerList.get(Medewerker.MedewerkerList.size()-1).getNaam());
    }
}
