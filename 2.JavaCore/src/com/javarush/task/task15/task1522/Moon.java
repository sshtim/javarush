package com.javarush.task.task15.task1522;

/**
 * Created by sshtim on 04.07.17.
 */
public class Moon implements Planet {
    private static Moon  instance = new Moon();

    private Moon(){
    }

    public static Moon getInstance(){
        return instance;
    }
}

