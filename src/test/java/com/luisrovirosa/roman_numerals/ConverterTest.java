package com.luisrovirosa.roman_numerals;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp(){
        converter = new Converter();
    }

    @Test
    public void converts_the_numbers(){
        assertThat(converter.toRoman(1), is("I"));
        assertThat(converter.toRoman(2), is("II"));
        assertThat(converter.toRoman(3), is("III"));
        assertThat(converter.toRoman(4), is("IV"));
        assertThat(converter.toRoman(5), is("V"));
        assertThat(converter.toRoman(6), is("VI"));
    }
}
