package com.javarush.task.task15.task1522;

/**
 * Created by sshtim on 04.07.17.
 */
public class Earth implements Planet {
    private static Earth instance = new Earth();

    private Earth(){
    }

    public static Earth getInstance(){
        return instance;
    }
}
