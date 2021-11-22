package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int num = 1;
        boolean canDivByNumber = false;
        for (int index = 2; index <= number - 1; index++) {
            num += index;
            if ((num % number) == 0) {
            canDivByNumber = true;
                break;
            }
        }
    return canDivByNumber;
    }
}
