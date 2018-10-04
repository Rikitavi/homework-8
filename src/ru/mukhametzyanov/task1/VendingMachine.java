package ru.mukhametzyanov.task1;

public class VendingMachine {
    private double money = 0;
    private String[] drinks = new String[]{"Кока-кола", "Спрайт", "Фанта"};

    protected String getDrink(int key) {
        return this.drinks[key];
    }

//Проверка длины массива в методе addMoney
    public void addMoney(double money) {
        this.money = money;
        if (this.money > 0) {
            System.out.println("Ваша сумма: " + money);
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }

    public void giveMeADrink(int key) {
        if (key > this.drinks.length) {
            System.out.println("Такого напитка нет!");
        } else {
            String drink = getDrink(key);
            System.out.println("Возьмите ваш напиток: " + drink);
        }
    }
}
