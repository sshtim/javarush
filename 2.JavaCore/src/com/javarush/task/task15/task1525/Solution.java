package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            FileReader file = new FileReader(Statics.FILE_NAME);
            BufferedReader filereader = new BufferedReader(file);
            while(filereader.ready()){
                lines.add(filereader.readLine());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
