package com.javarush.task.task15.task1522;

/**
 * Created by sshtim on 04.07.17.
 */
public class Sun implements Planet {
    private static Sun  instance = new Sun();

    private Sun(){
    }

    public static Sun getInstance(){
        return instance;
    }
}
