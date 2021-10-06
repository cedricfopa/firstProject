package com.springboot.firstproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonUnitTest {
    @Test
    public void testAddNomber(){
        MonUnit monUnit=new MonUnit();
        int valeurAdd = monUnit.addNomber(1,3);
        assertEquals( 4,valeurAdd);
    }


}
