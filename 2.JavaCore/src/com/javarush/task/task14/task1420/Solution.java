package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
            int first_num = Integer.parseInt(reader.readLine());
            int second_num = Integer.parseInt(reader.readLine());
            if(first_num<=0 || second_num<=0){
                throw new Exception();
            }
            int min = first_num < second_num ? first_num : second_num;
            int nod = 0;
            for (int i = 1; i <= min; i++) {
                if (first_num % i == 0 & second_num % i == 0) {
                    if (i > nod) {
                        nod = i;
                    }
                }
            }
            reader.close();
            System.out.println(nod);


    }
}
