package com.example.p5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapPairs {

    public LinkedHashMap mapChange(LinkedHashMap<String, String> map){

        Set keys = map.keySet();
        int i=0;
        String[] val=new String[keys.size()];
        String[] key=new String[keys.size()];

        Iterator it = keys.iterator();

         while(it.hasNext())
        {    key[i]= (String) it.next();
             val[i] = map.get(key[i]);
            i++;
        }

        String str = map.get(key[0]);
        map.put(key[0]," ");
        map.put(key[1],str);
        return map;

    }


    public static void main(String args[])
    {

    }
}
