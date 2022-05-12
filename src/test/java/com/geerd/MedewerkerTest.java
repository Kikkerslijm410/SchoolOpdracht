package com.geerd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.app.Medewerker;
import org.junit.jupiter.api.Test;

public class MedewerkerTest {

    Medewerker medewerkerTest = new Medewerker("Rachid van Dijk", 240);

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
}

