package com.javarush.task.task14.task1421;

/**
 * Created by sshtim on 29.06.17.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton(){}
}
