package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {

    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {

            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message{
        public void run() {
            while (true)
                System.out.println("I am Thread4");
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String s = reader.readLine();
                int sum=0;
                while (reader.ready()) {
                    if (s.equals("N"))
                        break;
                    else {
                        sum += Integer.parseInt(s);
                        s = reader.readLine();
                    }
                }
                System.out.println(sum);
                reader.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}