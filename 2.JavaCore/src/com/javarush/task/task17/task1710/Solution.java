package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            if(args[0].equals("-c")){
                if(args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], format.parse(args[3])));
                    System.out.println(allPeople.size()-1);
                }
                else if(args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], format.parse(args[3])));
                    System.out.println(allPeople.size() - 1);
                }
                else System.out.println("Unknown sex");
            } else if(args[0].equals("-u")){
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                if(args[3].equals("м")) {
                    person.setSex(Sex.MALE);
                }else person.setSex(Sex.FEMALE);
                person.setBirthDay(format.parse(args[4]));
            } else if(args[0].equals("-d")){
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
            } else if(args[0].equals("-i")){
                Person person = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(person);
            }
    }
}
