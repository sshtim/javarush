package com.javarush.task.task14.task1408;

/**
 * Created by sshtim on 09.07.17.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.RUSSIA+". Я несу "+ this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
