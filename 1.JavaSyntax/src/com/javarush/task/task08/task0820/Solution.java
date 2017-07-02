package com.javarush.task.task08.task0820;

import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set_cats = new HashSet<Cat>();
        set_cats.add(new Cat("Мурзик"));
        set_cats.add(new Cat("Мурка"));
        set_cats.add(new Cat("Аркаша"));
        set_cats.add(new Cat("Киса"));
        return set_cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> set_dogs = new HashSet<Dog>();
        set_dogs.add(new Dog("Шарик"));
        set_dogs.add(new Dog("Барсик"));
        set_dogs.add(new Dog("Рекс"));
        return set_dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result = new HashSet<Object>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }
    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static class Cat{
        private String name;
        public Cat(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static class Dog{
        private String name;
        public Dog(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
}
