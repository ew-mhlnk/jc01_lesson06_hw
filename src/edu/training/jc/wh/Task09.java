package edu.training.jc.wh;
//18. Подсчитать количество положительных среди чисел а, b, с.

public class Task09 {
    public static void main(String[] args) {
        int a = -3;
        int b = -4;
        int c = -10;
        
        int count = 0;
        
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        
        System.out.println("Количество положительных среди чисел а, b, с = " + count);
    }
}