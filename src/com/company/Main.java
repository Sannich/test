package com.company;

public class Main {

    public static void main(String[] args) {
        double d = 0.3;
        //создаем переменную і; цикл выполняеться пока І не будет равно = 20;в конце цикла і; збільшується на один
        for (int i = 1; i <= 20; i++) {
            System.out.println("Hello World" + i);
            System.out.println(++d);

        }
    }
}
