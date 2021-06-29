package hu.nive.ujratervezes.lettermultiplier;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class LetterMultiplier {

    public String multiply(String input, int number) {

        if(input == null || input.isEmpty() || number < 0) { throw new IllegalArgumentException();}


        String sum = IntStream.range(0, number).mapToObj(i -> input).collect(Collectors.joining(""));

        return sum;
    }
}
