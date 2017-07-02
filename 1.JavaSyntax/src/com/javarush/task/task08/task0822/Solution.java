package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Integer min = array.get(0);
        for(int i=0;i<array.size();i++){
            if(array.get(i)<min){
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        for(int i=0;i<number;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();
        return list;
    }
}
