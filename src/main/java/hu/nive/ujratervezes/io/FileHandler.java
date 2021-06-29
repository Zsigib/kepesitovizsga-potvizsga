package hu.nive.ujratervezes.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.Character.isDigit;

public class FileHandler {
    public int sumIgnoreComments(String s) {
        int sum = 0;
        Path path = Path.of(s);
        try (BufferedReader reader = Files.newBufferedReader(path)){
       //    new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        char[] arr = s.toCharArray();
        for(Character item : arr){
            if(isDigit(item)){
                sum += Character.getNumericValue(item);
            }

        }
        return sum;
    }
}
