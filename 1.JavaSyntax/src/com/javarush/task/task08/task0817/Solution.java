package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> values = new ArrayList<>();
        ArrayList<String> duplicates_values = new ArrayList<>();
        for(Map.Entry<String,String> entry:map.entrySet()){
            if(values.contains(entry.getValue())){
                duplicates_values.add(entry.getValue());
            }
            else {
                values.add(entry.getValue());
            }
        }
        for(String name:duplicates_values){
            removeItemFromMapByValue(map,name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String,String> map = createMap();
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        removeTheFirstNameDuplicates(map);
        System.out.println("+========================");
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
    }
}
