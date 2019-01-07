package com.example.p5;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NoOfStrCountTest {
    @Test
    public void testNoOfCount1() throws Exception {
        //Arrange
        HashMap<String,Boolean> expectedValue = new HashMap<>();
        String[] str = {"a","b","c","d","a","c","c"};
        expectedValue.put("a",true);
        expectedValue.put("b",false);
        expectedValue.put("c",true);
        expectedValue.put("d",false);

        NoOfStrCount n= new NoOfStrCount();

        HashMap<String,Integer>  actualValue = n.strCount(str);

        //Act
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testNoOfCount2() throws Exception {
        //Arrange
        HashMap<String,Boolean> expectedValue = new HashMap<>();
        String[] str = {"asd","mgm","c","asd","mgm","c","d"};
        expectedValue.put("asd",true);
        expectedValue.put("mgm",true);
        expectedValue.put("c",true);
        expectedValue.put("d",false);

        NoOfStrCount n= new NoOfStrCount();

        HashMap<String,Integer>  actualValue = n.strCount(str);

        //Act
        assertEquals(expectedValue, actualValue);
    }

}