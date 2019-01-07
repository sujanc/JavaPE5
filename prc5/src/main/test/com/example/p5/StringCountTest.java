package com.example.p5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class StringCountTest {
    @Test
    public void testStringCount() throws Exception {
        //Arrange
        HashMap<String,Integer> expectedValue = new HashMap<>();
        String str = "one one -one___two,,three,one @three*one?two";
        expectedValue.put("one",5);
        expectedValue.put("two",2);
        expectedValue.put("three",2);
        StringCount s= new StringCount();

        HashMap<String,Integer>  actualValue = s.count(str);

        //Act
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testStringCount2() throws Exception {
        //Arrange
        HashMap<String,Integer> expectedValue = new HashMap<>();
        String str = "one one -one___two,,three,one @three*one?twotwo@three";
        expectedValue.put("one",5);
        expectedValue.put("two",3);
        expectedValue.put("three",3);
        StringCount s= new StringCount();

        HashMap<String,Integer>  actualValue = s.count(str);

        //Act
        assertEquals(expectedValue, actualValue);
    }


}