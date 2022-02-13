package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay3Wed() {
        String x = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(x);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDay3WedRus() {
        String x = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(x);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDayM1Blah() {
        String x = "BlahBlahBlah";
        int result = MultipleSwitchWeek.numberOfDay(x);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}