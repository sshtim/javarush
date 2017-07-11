package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by sshtim on 11.07.17.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes image){
        if(image==ImageTypes.JPG){
            return new JpgReader();
        } else if(image==ImageTypes.PNG){
            return new PngReader();
        } else if(image==ImageTypes.BMP){
            return new BmpReader();
        } else throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
