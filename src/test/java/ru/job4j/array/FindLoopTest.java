package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then5() {
        int[] data = {5, 4, 3, 2};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}