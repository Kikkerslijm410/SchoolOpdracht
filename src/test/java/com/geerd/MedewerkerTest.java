package com.geerd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.app.Medewerker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        String juist = "gelukt";
        String test = "nietGelukt";

        int userRemoveStudentChoice = 1;
        if (userRemoveStudentChoice > 0){
        Medewerker.MedewerkerList.remove(userRemoveStudentChoice-1);
        test = "gelukt";
        }else{
        test = "niet gelukt";
        }
        
        assertEquals(juist, test);
    }
    
    @Test
    public void testMedewerkerAdd(){
            String naam = "Minte Eskes";
            String naamTest = "Minte Eskes";
            int werktijd = 240;
            Medewerker medewerker = new Medewerker(naam, werktijd);
           assertEquals(naamTest, medewerker.getNaam());
    }
    // Deze test is er om een methode aan te kunnen roepen voor het aanmaken van een nieuwe medewerker

    @Test
    public void testNewStudent3(){
        rescanner.sendlist.add("Lucas");
        rescanner.sendlist.add("1200923");
        Medewerker.medewerkerAdd(rescanner);

        //Test of de naam goed doorkomt
        String testName = "Lucas";
        String foutTestName = "Geerd";
        assertEquals(testName, Medewerker.MedewerkerList.get(Medewerker.MedewerkerList.size()-1).getNaam());
        assertNotEquals(foutTestName, Medewerker.MedewerkerList.get(Medewerker.MedewerkerList.size()-1).getNaam());
    }
}

