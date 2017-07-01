package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //String[] array1 = new String[20];
        for(int i=0;i<array.length;i++){
            int k=i;
            String tmp;
            for(int j=i+1;j<array.length;j++){
                if(isGreaterThan(array[i],array[j])){
                    k=j;
                }
                if(k!=i) {
                    tmp=array[i];
                    array[i] = array[k];
                    array[k] = tmp;
                }
            }

        }

    }


    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
