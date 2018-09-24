package com.luisrovirosa.roman_numerals;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Converter {
    public String toRoman(int number) {
        return conversions()
                .entrySet()
                .stream()
                .filter(c -> number >= c.getKey())
                .findFirst()
                .map(integerStringEntry -> integerStringEntry.getValue() + toRoman(number - integerStringEntry.getKey()))
                .orElse("");
    }

    private HashMap<Integer, String> conversions() {
        return new LinkedHashMap<Integer, String>() {{
            put(1000, "M");
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
    }
}
