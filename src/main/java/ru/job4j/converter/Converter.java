package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(245);
        float dollar = Converter.rubleToDollar(210);
        System.out.println("245 rubles are " + euro + " euro ");
        System.out.println("210 rubles are " + dollar + " dollars ");
    }
}
