package com.mrinalini.examples;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;



public class textToArray {
    public static void main(String[] args) {

        String file =  "C:\\Users\\Mrinalini\\Documents\\Code\\JavaCode\\Project1\\src\\main\\java\\com\\mrinalini\\examples\\qr\\textex.txt";
        String fileName = file;
        try {
            Path p = new File(fileName).toPath();
            System.out.println("Path = "+p);
            System.out.println(fileName);
            List<String> allLinesOfFile = Files.readAllLines(p, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}