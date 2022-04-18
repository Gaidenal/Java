package ru.gb.semenova.homework1;

public class Task3 {
    public static void  checkSumSign() {
      int a = 10;
      int b = 15;
      int sum = a + b;
      if (sum >= 0){
          System.out.println("The amount is positive");
      } else {
          System.out.println("The sum is negative");
      }
    }
    public static void main(String[] args) {
        checkSumSign();
    }
}
