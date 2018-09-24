package com.luisrovirosa.roman_numerals;

public class Converter {
    public String toRoman(int number) {
        String[] numbers = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV"
        };
        return numbers[number - 1];
    }
}
