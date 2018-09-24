package com.luisrovirosa.roman_numerals;

public class Converter {
    public String toRoman(int number) {
        String[] numbers = {
                "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
        };
        if (number >= 50) {
            return "L" + toRoman(number - 50);
        }
        if (number >= 10) {
            return "X" + toRoman(number - 10);
        }
        return numbers[number];
    }
}
