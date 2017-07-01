package com.javarush.task.task13.task1325;

import java.awt.*;

/* 
Компиляция программы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        public Color getColor();
    }

    public abstract static class Fox implements Animal {
        public abstract String getName();
        }



    public  static class BigFox extends Fox{
        public String getName() {
            return "Fox";
        }
        public Color getColor(){
            return new Color(123,241,123);

        }
    }

}
