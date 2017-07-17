package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        char[] ch = line.toCharArray();

        if(Character.isLetter(ch[0])) {
            ch[0] = Character.toUpperCase(ch[0]);
        }
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==' ' & Character.isLetter(ch[i+1])){
                ch[i+1] = Character.toUpperCase(ch[i+1]);
            }
        }
        System.out.println(ch);
    }
}
