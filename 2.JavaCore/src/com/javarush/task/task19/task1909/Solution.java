package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader file1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(fileName2));
        ArrayList<Character> temp = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();
        while(file1.ready()){
            temp.add((char)file1.read());
        }
        for(Character ch:temp){
            if(ch=='.')
                result.add('!');
            else result.add(ch);

        }
        for(Character ch:result){
            file2.write(ch);
        }
        reader.close();
        file1.close();
        file2.close();
    }
}
