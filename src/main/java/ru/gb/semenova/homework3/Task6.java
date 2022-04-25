package ru.gb.semenova.homework3;
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        int max = 0;
        int min;

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(50);
        }
        min = a[0];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++){
            if (max < a[i]){
                max = a[i];
            }

            if (min > a[i]){
                min = a[i];
            }

        }
        System.out.println(max + " - максимальный элемент, " + min+ " - минимальный элемент.");
    }
}
