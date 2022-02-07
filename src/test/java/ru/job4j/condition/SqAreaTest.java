package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    
    @Test
    public void whenP9K3Square3d79() {
        double expected = 3.79;
        int p = 9;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K11Square0d17() {
        double expected = 0.17;
        int p = 3;
        int k = 11;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}