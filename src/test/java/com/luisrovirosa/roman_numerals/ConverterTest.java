package com.luisrovirosa.roman_numerals;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void converts_one_into_i(){
        Converter converter = new Converter();

        assertThat(converter.toRoman(1), is("I"));
    }
    @Test
    public void converts_two_into_ii(){
        Converter converter = new Converter();

        assertThat(converter.toRoman(2), is("II"));
    }
}
