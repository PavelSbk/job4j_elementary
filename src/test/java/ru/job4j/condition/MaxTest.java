package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1mTo2mTo1Then1() {
        int first = -1;
        int second = -2;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To7To3To5Then7() {
        int first = 2;
        int second = 7;
        int third = 3;
        int forth = 5;
        int result = Max.max(first, second, third, forth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}