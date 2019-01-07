package com.example.p5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class SortStudentTest {


    @Test
    public void testSort1() throws Exception {
        //Arrange

        ArrayList<String> expectedValue = new ArrayList<>();
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");


        SortStudent s= new SortStudent();

        HashSet<String> hs = new HashSet<>();
        hs.add("Harry");
        hs.add("Olive");
        hs.add("Alice");
        hs.add("Bluto");
        hs.add("Eugene");

        ArrayList<String>  actualValue = s.sortStu(hs);

        //Act
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testSort2() throws Exception {
        //Arrange

        ArrayList<String> expectedValue = new ArrayList<>();
        expectedValue.add("apple");
        expectedValue.add("banana");
        expectedValue.add("mango");
        expectedValue.add("orange");
        expectedValue.add("zilo");


        SortStudent s= new SortStudent();

        HashSet<String> hs = new HashSet<>();
        hs.add("zilo");
        hs.add("banana");
        hs.add("apple");
        hs.add("mango");
        hs.add("orange");

        ArrayList<String>  actualValue = s.sortStu(hs);

        //Act
        assertEquals(expectedValue, actualValue);
    }



}