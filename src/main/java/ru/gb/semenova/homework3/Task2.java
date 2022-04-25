package ru.gb.semenova.homework3;
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args){
        int [] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
           numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
