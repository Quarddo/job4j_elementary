package ru.job4j.condition;

public class MaxMy {

    public static int getMax(int a, int b, int c) {
        int rsl = -1;
        if (a > b) {
            rsl = a > c ? a : c;
        } else {
            rsl = b > c ? b : c;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        int rsl = MaxMy.getMax(a, b, c);
        System.out.println(rsl);
    }
}
