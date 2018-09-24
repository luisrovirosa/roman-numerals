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
        assertThat(converter.toRoman(7), is("VII"));
        assertThat(converter.toRoman(8), is("VIII"));
        assertThat(converter.toRoman(9), is("IX"));
        assertThat(converter.toRoman(10), is("X"));
        assertThat(converter.toRoman(11), is("XI"));
        assertThat(converter.toRoman(12), is("XII"));
        assertThat(converter.toRoman(13), is("XIII"));
        assertThat(converter.toRoman(14), is("XIV"));
        assertThat(converter.toRoman(15), is("XV"));
        assertThat(converter.toRoman(20), is("XX"));
        assertThat(converter.toRoman(40), is("XL"));
        assertThat(converter.toRoman(50), is("L"));
        assertThat(converter.toRoman(90), is("XC"));
        assertThat(converter.toRoman(100), is("C"));
        assertThat(converter.toRoman(400), is("CD"));
        assertThat(converter.toRoman(500), is("D"));
    }
}
