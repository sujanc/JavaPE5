package com.example.p5;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapPairsTest {
    @Test
    public void testMapPair1() throws Exception {
        //Arrange
        LinkedHashMap<String,String> expectedValue = new LinkedHashMap<>();
        expectedValue.put("Madrid"," ");
        expectedValue.put("Juventus","Ronaldo" );

        MapPairs p= new MapPairs();
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("Madrid","Ronaldo");
        map.put("Juventus","Dybala" );


        LinkedHashMap<String,Integer>  actualValue = p.mapChange(map);

        //Act
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testMapPair2() throws Exception {
        //Arrange
        LinkedHashMap<String,String> expectedValue = new LinkedHashMap<>();
        expectedValue.put("apple"," ");
        expectedValue.put("mango","red" );

        MapPairs p= new MapPairs();
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("apple","red");
        map.put("mango","Dybala" );


        LinkedHashMap<String,Integer>  actualValue = p.mapChange(map);

        //Act
        assertEquals(expectedValue, actualValue);
    }



}