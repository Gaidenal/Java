package ru.gb.semenova.homework2;

public class Task2 {
    public static void checkNumber(int a){
        if (a >= 0){ System.out.println("Число положительное");}
        else if (a < 0) { System.out.println("Число отрицательное");}
        else {System.out.println("Какая-то неведома зверушка");}
    }
    public static void main (String[] args){
        checkNumber(5);
    }
}
