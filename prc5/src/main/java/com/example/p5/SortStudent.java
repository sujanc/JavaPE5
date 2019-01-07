package com.example.p5;


import java.util.*;

public class SortStudent {

    public ArrayList<String> sortStu(HashSet<String> set){

        ArrayList<String> li=new ArrayList<>();
        Set<String> treeSet = new TreeSet<String>(set);
        Iterator<String> it=treeSet.iterator();

        while(it.hasNext())
        {
            li.add(it.next());
        }
        return li;

    }

    public static void main(String args[]){}
}
