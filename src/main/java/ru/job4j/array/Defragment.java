package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int nullIndex = i;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j;
                        SwitchArray.swap(array, nullIndex, notNullIndex);
                    }
                }
            }
        }
        return array;
    }
}
