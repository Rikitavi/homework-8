package ru.mukhametzyanov.task3;

/**@author Ruslan Mukhametzyanov
 * Класс вызывает методы класса калькулятора{@link Calculator}
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(Calculator.sum(5, 6));
        System.out.println(Calculator.sum(5.5, 6.6));
        System.out.println(Calculator.procent(5,100));
    }
}
