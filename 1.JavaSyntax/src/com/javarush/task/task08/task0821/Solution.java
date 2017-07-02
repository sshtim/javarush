package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Moran","Alex1");
        map.put("Moran","Alex");
        map.put("Moran2","Alex");
        map.put("Moran2","Alex3");
        map.put("Moran2","Alex1");
        map.put("Moran","Alex3");
        map.put("Moran","Alex");
        map.put("Moran","Alex1");
        map.put("Moran3","Alex");
        map.put("Moran3","Alex");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
