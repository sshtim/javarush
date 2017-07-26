package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(args[0]);
        double k=0;
        double n=file.available();
        while (file.available()>0){
            if(file.read()==32)
                k++;
        }
        double result = k/n*100;
        System.out.printf("%.2f",result);
        file.close();

    }
}
