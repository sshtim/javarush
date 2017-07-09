package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> numbers = new LinkedList<>();
        try{
            while(true){
                numbers.add(Integer.parseInt(reader.readLine()));

            }

        }
        catch (Exception e){
            for(Integer number: numbers){
                System.out.println(number);
            }
        }
    }
}
