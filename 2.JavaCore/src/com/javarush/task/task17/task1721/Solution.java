package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader file_reader1 = new BufferedReader(new FileReader(reader.readLine()));
            BufferedReader file_reader2 = new BufferedReader(new FileReader(reader.readLine()));

            while(file_reader1.ready()){
                allLines.add(file_reader1.readLine());
            }
            while(file_reader2.ready()){
                forRemoveLines.add(file_reader2.readLine());
            }
            new Solution().joinData();
            //System.out.println(allLines);
            //System.out.println(forRemoveLines);
        }
        catch (CorruptedDataException e){
            System.out.println("Произошел сбой");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {

        for(String str: forRemoveLines) {
            if (allLines.contains(str))
                continue;
            else {
                allLines.removeAll(allLines);
                throw new CorruptedDataException();
            }
        }
        for(String str: forRemoveLines) {
            allLines.remove(str);
        }


    }
}
