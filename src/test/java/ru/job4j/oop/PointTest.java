package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(2.0));
    }

    @Test
    public void distance3d() {
        Point a = new Point(-2, -1, 0);
        Point b = new Point(1, 2, 3);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(5.196, 0.001));
    }
}