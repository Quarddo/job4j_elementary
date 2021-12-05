package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            while (coins.length > 0) {
                rsl[rsl.length] -= rsl[change];
                rsl[change] -= coins[i];
                rsl[rsl.length] += rsl[money];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
