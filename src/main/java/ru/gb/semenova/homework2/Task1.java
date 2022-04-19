package ru.gb.semenova.homework2;

public class Task1 {
    public static void myMethodSum (int a, int b){
        if ( (a+b) >= 10 && (a+b) <= 20){
            System.out.println ("True");
        } else {System.out.println ("false");
        }
    }
    public static void main(String[] args) {
    myMethodSum(10, 2);
    }
}
