package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int multi = 1;
        for (int index = 1; index <= n; index++) {
        multi = multi * index;
        }
        return multi;
    }
}
