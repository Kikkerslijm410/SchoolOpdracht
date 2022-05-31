package com.geerd;

import com.app.Medewerker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testMedewerker {

    private RepeatingTestScanner rescanner;
    private TestScanner testScanner;
    public Medewerker testMedewerker;

    @BeforeEach
    public void init(){
        testMedewerker = new Medewerker("Geerd", 3);
        testScanner = new TestScanner();
        rescanner = new RepeatingTestScanner();
    }

    @AfterEach
    public void clear(){
        rescanner.clear();
        for (int i = 0; i < 10; i++){
        testScanner.setInt(i);
        Medewerker.medewerkerDelete(testScanner);
        }
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

    @Test
    public void testCheckMedewerkers(){
        assertEquals(true, Medewerker.getMedewerkers(testScanner));
        Medewerker.MedewerkerList.clear();
        assertEquals(false, Medewerker.getMedewerkers(testScanner));
    }

    @Test
    public void testWerktijdAdd(){
        testScanner.setInt(1);
        testScanner.setDouble(0);
        testScanner.setString("x");
        Medewerker.werktijdAdd(testScanner);
        assertEquals(0, Medewerker.MedewerkerList.get(Medewerker.MedewerkerList.size() - 1).getWerktijd());
    }
}
