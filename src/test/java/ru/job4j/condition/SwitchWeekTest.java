package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayWedNmbr3() {
        int x = 3;
        String result = SwitchWeek.nameOfDay(3);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfDaySunNmbr7() {
        int x = 3;
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }
}