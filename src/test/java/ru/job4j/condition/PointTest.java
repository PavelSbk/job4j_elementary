package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static java.awt.geom.Point2D.distance;

public class PointTest {
    @Test
    public void whenX11Y3toX8Y1hen9d70() {
        double expected = 3.60;
        Point a = new Point(11, 3);
        Point b = new Point(8, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX11Y3Z9toX8Y1Z0hen9d70() {
        double expected = 9.70;
        Point a = new Point(11, 3, 9);
        Point b = new Point(8, 1, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX1Y2Z7toX5Y0Z10hen9d70() {
        double expected = 5.39;
        Point a = new Point(1, 2, 7);
        Point b = new Point(5, 0, 10);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}