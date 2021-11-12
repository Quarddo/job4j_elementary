package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rls = (187 - 100) * 1.15;
        return rls;
    }

    public static double womanWeight(double height) {
        double rls = (165 - 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = Fit.manWeight(manHeight);
        short womanHeight = 165;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 165 is " + woman);
    }
}
