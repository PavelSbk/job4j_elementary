package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static java.awt.geom.Point2D.distance;

public class PointTest {

    @Test
    public void when11to02then1d41() {

        double expected = 1.41;
        int x1 = 1;
        int y1 = 1;
        int x2 = 0;
        int y2 = 2;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to52then2d23() {

        double expected = 2.23;
        int x1 = 3;
        int y1 = 1;
        int x2 = 5;
        int y2 = 2;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to56then2d82() {
        double expected = 2.82;
        int x1 = 3;
        int y1 = 4;
        int x2 = 5;
        int y2 = 6;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when113to81then3d60() {
        double expected = 3.60;
        int x1 = 11;
        int y1 = 3;
        int x2 = 8;
        int y2 = 1;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}