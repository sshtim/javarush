package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename=reader.readLine();
        while(!filename.equals("exit")){
            new ReadThread(filename).start();
            filename=reader.readLine();
        }
    }

    public static class ReadThread extends Thread  {
        String fileName;
        public ReadThread(String fileName) {
            this.fileName=fileName;
        }
        public void run(){
            try {
                Integer[] array = new Integer[255];
                for(int i=0;i<array.length;i++) {
                    array[i]=0;
                }
                byte b;
                FileInputStream file = new FileInputStream(fileName);
                while(file.available()>0) {
                    b=(byte)file.read();
                    array[b]++;
                }
                int max=array[0];
                for(int i=0;i<array.length;i++){
                    if(array[i]>max){
                        max=array[i];
                    }
                }
                resultMap.put(fileName,Arrays.asList(array).indexOf(max));
                file.close();
            }
            catch (Exception e){
                System.out.println("Error reading from file");
            }

            }
        }
    }

