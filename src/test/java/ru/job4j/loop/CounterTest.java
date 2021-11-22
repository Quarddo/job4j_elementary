package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToNineThenEighteen() {
        int start = 3;
        int finish = 9;
        int result = Counter.sumByEven(start,finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromOneToSixThenTwentyOne() {
        int start = 1;
        int finish = 6;
        int result = Counter.sum(start, finish);
        int expected = 21;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromOneToElevenThenSixtySix() {
        int start = 1;
        int finish = 11;
        int result = Counter.sum(start, finish);
        int expected = 66;
        Assert.assertEquals(expected, result);
    }
}
