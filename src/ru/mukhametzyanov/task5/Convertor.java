package ru.mukhametzyanov.task5;

public class Convertor {

    public static Akt convert(Dogovor dogovor) {
        Akt akt = new Akt();
        int[] data = dogovor.getData();
        akt.setData(data);
        int[] number = dogovor.getNumber();
        akt.setNumber(number);
        String[] productList = dogovor.getProductList();
        akt.setProductList(productList);
        return akt;
    }

    public static void main(String[] args) {

        Dogovor dogovor = new Dogovor();
        dogovor.setProductList(new String[]{" ", " "});
        dogovor.setData(new int[]{1, 2});
        dogovor.setNumber(new int[]{0, 1, 2});
        System.out.println(Convertor.convert(dogovor));
    }
}
