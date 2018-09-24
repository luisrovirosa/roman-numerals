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
    public void converts_one_into_i(){
        assertThat(converter.toRoman(1), is("I"));
    }

    @Test
    public void converts_two_into_ii(){
        assertThat(converter.toRoman(2), is("II"));
    }

    @Test
    public void converts_three_into_iii(){
        assertThat(converter.toRoman(3), is("III"));
    }

    @Test
    public void converts_four_into_iv(){
        assertThat(converter.toRoman(4), is("IV"));
    }
}
