package ru.gb.semenova.homework2;

public class Task4 {
    public static void printString (String a, int b){
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        printString("Is there life on Mars?", 5);
    }
}
