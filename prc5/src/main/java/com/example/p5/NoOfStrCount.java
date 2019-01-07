package com.example.p5;

import java.util.HashMap;

public class NoOfStrCount {


    public HashMap strCount(String[] str)
    {
        HashMap<String,Boolean> m= new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            if(m.get(str[i])== null)
                m.put(str[i],false);
            else
                m.put(str[i],true);
        }

        return m;
    }


    public static void main(String args[])
    {
    }
}
