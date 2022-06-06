package com.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.Pad;

public class testVrachtController {

    public Pad inter;

    @BeforeEach
    public void start(){
        inter = new Pad("Internationaal", 60, 0);
        Pad.setAantalDozen(0, 0);
    }
    @AfterEach
    public void end(){
        Pad.setAantalDozen(0, 0);
    }

    @Test
    void testReset() {
        Pad.setAantalDozen(0, 10);
        assertEquals(10, Pad.PadList.get(0).aantalDozen);
        VrachtController.setZero();
        assertEquals(0, Pad.PadList.get(0).aantalDozen);
    }

    @Test
    void testStringToInt() {
        assertEquals(0, VrachtController.StringToInt(0, ""));
        Pad.setAantalDozen(0, 10);
        assertEquals(10, VrachtController.StringToInt(0, "10"));
    }
}
