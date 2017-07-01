package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("васfилий",true,80);
        Human ded2 = new Human("петя",true,80);
        Human bab2 = new Human("надя",false,75);
        Human bab1 = new Human("надя2",false,75);
        Human mam = new Human("вера",false,50,ded1,bab1);
        Human pap = new Human("костя",false,50,ded2,bab2);
        Human reb1 = new Human("костя1",false,20,pap,mam);
        Human reb2 = new Human("костя2",false,10,pap,mam);
        Human reb3 = new Human("костя3",false,5,pap,mam);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(mam);
        System.out.println(pap);
        System.out.println(reb1);
        System.out.println(reb2);
        System.out.println(reb3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father= null;
        Human mother= null;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name,boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















