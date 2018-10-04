package ru.mukhametzyanov.task5;

import java.util.Arrays;

public class Dogovor {

    private int[] number;
    private int[] data;
    private String[] productList;

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String[] getProductList() {
        return productList;
    }

    public void setProductList(String[] productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Dogovor{" +
                "number=" + Arrays.toString(number) +
                ", data=" + Arrays.toString(data) +
                ", productList=" + Arrays.toString(productList) +
                '}';
    }
}
