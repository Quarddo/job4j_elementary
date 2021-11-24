package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        percent /= 100;
        double remainder = amount * percent + amount;
        while (salary <= remainder) {
            remainder -= salary;
            remainder += remainder * percent;
            year += 1;
        }
        return year;
    }
}
