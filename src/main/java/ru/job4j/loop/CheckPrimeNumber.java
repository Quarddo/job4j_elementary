package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = number > 1;
        for (int index = 2; index < number - 1; index++) {
            if ((number % index) == 0) {
            result = false;
                break;
            }
        }

    return result;
    }
}
