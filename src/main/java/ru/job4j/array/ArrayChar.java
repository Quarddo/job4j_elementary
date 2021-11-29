package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 1; i < word.length; i++) {
            for (int j = 1; j < pref.length; j++) {
                if (word[0] != pref[0]) {
                    return false;
                }
            }
        }
        return true;
    }
}

