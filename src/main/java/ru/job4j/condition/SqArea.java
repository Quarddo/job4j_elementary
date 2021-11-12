package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k, double s) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2, 2);
        double p = 6;
        double k = 2;
        double s = 2;
        double h = p / (2 * (k + 1));
        double l = h * k;
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1 + " h = " + h + " l = " + l);
    }
}
