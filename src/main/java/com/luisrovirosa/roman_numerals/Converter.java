package com.luisrovirosa.roman_numerals;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    public String toRoman(int number) {
        String[] numbers = {
                "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
        };

        HashMap<Integer, String> letters = new HashMap<Integer, String>(){{
            put(50, "L");
            put(40, "XL");
            put(10, "X");
        }};

        for (Map.Entry<Integer, String> conversion: letters.entrySet()) {
            if (number >= conversion.getKey()){
                return conversion.getValue() + toRoman(number - conversion.getKey());
            }
        }
        return numbers[number];
    }
}
