package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(char bukva:alphabet){
            int kol=0;
            for(String line: list){
                for(char letter: line.toCharArray()){
                    if(bukva==letter){
                        kol++;
                    }
                }

            }
            map.put(bukva,kol);
        }
        for(char letter:alphabet) {

            System.out.println(letter + " " + map.get(letter));
        }
    }


}
