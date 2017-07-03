package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;



    public static void readKeyFromConsoleAndInitPlanet() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if(line.equals(Planet.EARTH)){
            thePlanet= Earth.getInstance();
        }
        if(line.equals(Planet.SUN)){
            thePlanet= Sun.getInstance();
        }
        if(line.equals(Planet.MOON)){
            thePlanet= Moon.getInstance();
        }
    }
}
