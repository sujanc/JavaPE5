package com.example.p5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
            public void testStudentInfo1() {




            ArrayList<Student> expectedList = new ArrayList<Student>();
            expectedList.add(new Student(5,"Aman", 16 ));
            expectedList.add(new Student(4,"Nithin", 15 ));
            expectedList.add(new Student(3,"earl", 14 ));
            expectedList.add(new Student(2,"Nandan", 13 ));
            expectedList.add(new Student(1,"Sachin", 12 ));

            ArrayList<Student> li = new ArrayList<Student>();
            li.add(new Student(1,"Nithin", 15 ));
            li.add(new Student(2,"Nandan", 13 ));
            li.add(new Student(3,"Aman", 16 ));
            li.add(new Student(4,"Sachin", 12 ));
            li.add(new Student(5,"earl", 14 ));

            StudentSorter s = new StudentSorter();


            assertEquals("error", expectedList.toString(), s.compare(li).toString());


        }



    }



}