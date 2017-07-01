package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("MAY 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JANUARY 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 5 1996"));
        map.put("Stallone9", new Date("APRIL 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> array = new ArrayList<>();

       // for (HashMap.Entry<String, Date> entry : map.entrySet()) {
       //     System.out.println(entry.getKey()+ " " + entry.getValue());
       // }
        for (HashMap.Entry<String, Date> entry : map.entrySet()) {
            if (entry.getValue().getMonth() == 5 || entry.getValue().getMonth() == 6 || entry.getValue().getMonth() == 7) {
                array.add(entry.getKey());
            }
        }
        for(String name:array){
            map.remove(name);
        }
       // System.out.println("===============");
       // for (HashMap.Entry<String, Date> entry : map.entrySet()) {
       //     System.out.println(entry.getKey()+ " " + entry.getValue());
       // }
    }


    public static void main(String[] args) {
        HashMap<String,Date> map = createMap();
        removeAllSummerPeople(map);

    }
}
