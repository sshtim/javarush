package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    private FileOutputStream original;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream file) throws FileNotFoundException {
        super(fileName);
        this.original=file;

    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void close() throws IOException {
        original.flush();
        String s ="JavaRush © All rights reserved.";
        original.write(s.getBytes());
        original.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}
