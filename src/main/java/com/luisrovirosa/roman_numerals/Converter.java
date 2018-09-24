package com.luisrovirosa.roman_numerals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Converter {
    public String toRoman(int number) {
        HashMap<Integer, String> letters = new LinkedHashMap<Integer, String>() {{
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};

        for (Map.Entry<Integer, String> conversion : letters.entrySet()) {
            if (number >= conversion.getKey()) {
                return conversion.getValue() + toRoman(number - conversion.getKey());
            }
        }
        return "";
    }
}
