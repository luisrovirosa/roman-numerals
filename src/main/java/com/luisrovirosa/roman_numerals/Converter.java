package com.luisrovirosa.roman_numerals;

public class Converter {
    public String toRoman(int number) {
        String[] numbers = {"I", "II", "III", "IV", "V", "VI"};
        return numbers[number - 1];
    }
}
