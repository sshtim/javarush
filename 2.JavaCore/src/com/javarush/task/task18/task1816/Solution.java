package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader(args[0]);
        char[] letters =  {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        int k=0;
        while (file.ready()){
            char s = (char)file.read();
            for(char ch:letters) {
                if (Character.toLowerCase(s) == ch)
                    k++;
            }
        }
        System.out.println(k);
        file.close();
    }
}
