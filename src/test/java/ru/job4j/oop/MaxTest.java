package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMaxOf2() {
        int result = Max.max(1, 5);
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMaxOf3() {
        int result = Max.max(3, 4, 0);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMaxOf4() {
        int result = Max.max(-2, -1, 0, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }
}