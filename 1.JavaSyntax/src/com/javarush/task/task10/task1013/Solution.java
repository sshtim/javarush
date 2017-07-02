package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String FirstName;
        private String LastName;
        private String address;
        private int age;
        private boolean sex; // 0-male, 1-female
        private boolean isWorker;

        public Human(){

        }

        public Human(String FirstName,String LastName){
            this.FirstName=FirstName;
            this.LastName=LastName;
        }

        public Human(String FirstName,String LastName,int age){
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.age=age;
        }

        public Human(String FirstName,String LastName,int age,String address){
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.age=age;
            this.address=address;
        }

        public Human(String FirstName,String LastName,int age,String address,boolean sex){
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.age=age;
            this.address=address;
            this.sex=sex;
        }

        public Human(String FirstName,String LastName,int age,String address,boolean sex,boolean isWorker){
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.age=age;
            this.address=address;
            this.sex=sex;
            this.isWorker=isWorker;
        }

        public Human(String FirstName,boolean sex,boolean isWorker){
            this.FirstName=FirstName;
            this.sex=sex;
            this.isWorker=isWorker;
        }

        public Human(String FirstName,String LastName,boolean sex){
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.sex=sex;
        }

        public Human(String FirstName,int age){
            this.FirstName=FirstName;
            this.age=age;
        }

        public Human(String FirstName,String LastName,String address){
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.address=address;
        }

    }
}
