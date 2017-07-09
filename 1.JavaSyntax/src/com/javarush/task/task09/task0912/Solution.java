package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами
*/

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {

            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
