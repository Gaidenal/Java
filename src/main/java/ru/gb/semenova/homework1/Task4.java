package ru.gb.semenova.homework1;

public class Task4 {
    public static void  printColor() {
        int value = 100;
        if (value <= 0){
            System.out.println("Red");
        } else if (value > 0 && value <= 100){
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    public static void main(String[] args) {
        printColor();
    }
}
