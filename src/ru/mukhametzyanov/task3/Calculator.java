package ru.mukhametzyanov.task3;

/**
 * В классе опиcаны методы калькулятора. Вызваются в классе мэйн{@link Main}
 */
public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int devide(int a, int b) {
        return a / b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double procent(double a, double b){
        return a % b;
    }
}
