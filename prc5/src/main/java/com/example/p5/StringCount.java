package com.example.p5;

import java.util.HashMap;

public class StringCount {

    public HashMap count(String str) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String stri = str.replaceAll("[-+.^:,@___<>*?_]", " ");
        String st[] = stri.split(" ");
        int[] count = {0, 0, 0};

        for (int i = 0; i < st.length; i++) {

            if (st[i].equals("one")) {
                map.put("one", ++count[0]);
            } else if (st[i].equals("two")) {
                map.put("two", ++count[1]);
            } else if (st[i].equals("three")) {
                map.put("three", ++count[2]);
            }

        }
        return map;
    }

    public static void main(String args[]){

    }

}

