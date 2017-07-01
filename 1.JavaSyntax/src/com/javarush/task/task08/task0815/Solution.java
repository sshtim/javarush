package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Дилkjьмиев","Тимур");
        map.put("Дильkмиев","Тиму");
        map.put("Диertyu","Тиур");
        map.put("Дsdfghи","Тимур");
        map.put("Ди2льмиев","Тreимур");
        map.put("Дильerмиев","Тимур");
        map.put("Дил5ьмиreев","Тиreмур");
        map.put("Диль7миreев","Тимуkjр");
        map.put("Ди4льмerиев","Тимур");
        map.put("Дильмwиев","Тимуreр");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int number=0;
        for(Map.Entry<String,String> entry: map.entrySet()){
            if(entry.getValue().equals(name)){
                number++;
            }
        }
        return number;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int number=0;
        for(Map.Entry<String,String> entry: map.entrySet()){
            if(entry.getKey().equals(lastName)){
                number++;
            }
        }
        return number;

    }

    public static void main(String[] args) {
       // HashMap<String,String> map = createMap();
       // System.out.println(getCountTheSameFirstName(map,"Тимур"));
        //System.out.println(getCountTheSameLastName(map,"Ди"));

    }
}
