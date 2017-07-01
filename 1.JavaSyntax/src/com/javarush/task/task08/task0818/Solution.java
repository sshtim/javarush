package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("тимур",407);
        map.put("тимур1",408);
        map.put("тимур2",409);
        map.put("тимур3",409);
        map.put("тимур4",410);
        map.put("тимур5",500);
        map.put("тимур6",503);
        map.put("тимур7",564);
        map.put("тимур8",765);
        map.put("тимур9",10000);
        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for(Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 500) {
                    it.remove();
                }
            }
        }


    public static void main(String[] args) {
        HashMap<String,Integer> map = createMap();

        removeItemFromMap(map);


    }

    }
