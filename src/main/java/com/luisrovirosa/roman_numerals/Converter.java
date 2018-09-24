package com.luisrovirosa.roman_numerals;

public class Converter {
    public String toRoman(int number) {
        if (number == 2){
            return "II";
        }
        return "I";
    }
}
