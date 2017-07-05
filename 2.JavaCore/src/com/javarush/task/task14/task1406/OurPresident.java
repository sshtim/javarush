package com.javarush.task.task14.task1406;

/**
 * Created by sshtim on 04.07.17.
 */
public class OurPresident {
    private static OurPresident instance;
    private OurPresident(){
    }
    public static synchronized OurPresident getOurPresident(){
        if(instance==null){
            instance=new OurPresident();
        }
        return instance;
    }
}
