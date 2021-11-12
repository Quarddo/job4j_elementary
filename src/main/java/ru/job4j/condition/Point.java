package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rls = 2;
        return rls;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double x1 = 0;
        double x2 = 2;
        double y1 = 0;
        double y2 = 0;
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double sixth = Math.sqrt(fifth);
        System.out.println(sixth);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
