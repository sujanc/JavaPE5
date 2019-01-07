package com.example.p5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitsTest {
    @Test
    public void testFruits() throws Exception {
        //Arrange
        List<String> expectedValue = new ArrayList<>();
        Fruits s = new Fruits();
        expectedValue.add("Kiwi");
        expectedValue.add("Grape");
        expectedValue.add("Mango");
        expectedValue.add("Berry");
        List<String> fru = new ArrayList<>();
        fru.add("Apple");
        fru.add("Grape");
        fru.add("Melon");
        fru.add("Berry");

        List<String> actualValue = s.replace(fru);

        //Act
        assertEquals(expectedValue, actualValue);
    }

}