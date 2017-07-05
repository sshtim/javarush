package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        System.out.println(cat);
    }

    public static void main(String[] args) {


    }
    public static class Cat{
        public String name="fgfd";
        public Cat(){
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
