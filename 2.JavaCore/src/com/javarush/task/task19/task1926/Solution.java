package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        while(file.ready()){
            String line = file.readLine();
            StringBuilder str = new StringBuilder(line);
            System.out.println(str.reverse().toString());
        }

        reader.close();
        file.close();


    }
}
