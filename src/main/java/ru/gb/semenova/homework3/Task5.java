package ru.gb.semenova.homework3;
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static int[] returnArr (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
           arr[i] = initialValue;
        }
        return arr;


    }
    public static void main(String[] args){

        System.out.println(Arrays.toString(returnArr(5,8)));

    }

}
