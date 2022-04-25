package ru.gb.semenova.homework3;
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.*;

public class Task1 {

    public static void main(String[] args){
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++){
            a[i] = new Random().nextInt(2);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0) a[i] = 1;
            else a[i] = 0;
        }
        System.out.println(Arrays.toString(a));

    }

}
