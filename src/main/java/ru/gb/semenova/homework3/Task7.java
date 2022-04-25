package ru.gb.semenova.homework3;
//7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static boolean sumPart(int[] checkBalance){
        int a = checkBalance[0];
        int b = checkBalance[checkBalance.length - 1];
        int num = 2;
        int i = 1;
        int j = 1;
        while ( num <= checkBalance.length){
            if(a < b && num < checkBalance.length){
                a = a + checkBalance[i];
                num++;
                i++;
            } else if (a > b && num < checkBalance.length) {
                b = b + checkBalance[checkBalance.length -1- j];
                num++;
                j++;
            } else if (a == b && checkBalance.length - num > 1) {
                a = a + checkBalance[i];
                num++;
                i++;
                b = b + checkBalance[checkBalance.length -1 - j];
                num++;
                j++;
            } else if (a == b && checkBalance.length - num == 1){
                a = a + checkBalance[i];
                num++;
                i++;
            }
            else if (a == b && num == checkBalance.length){
                break;
            } else {
                break;
            }

        }
        System.out.println("Левая часть равна: " + a + ". " + " Правая часть равна: " + b);
        return (a==b);
    }
    public static void main(String[] args){
        int[] checkBalance = new int [10];
        for (int i = 0; i < checkBalance.length; i++) {
            checkBalance[i] = new Random().nextInt(5);
        }
        System.out.println(Arrays.toString(checkBalance));
        System.out.println(sumPart(checkBalance));
    }

}
