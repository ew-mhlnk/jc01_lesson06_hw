package edu.training.jc.wh;
// 20. Определить, делителем каких чисел а, b, с является число k.

public class Task10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 4;
        int k = 1;
        
        // Проверяем каждое число отдельно
        if (a % k == 0) {
            System.out.println("k является делителем числа a");
        }
        if (b % k == 0) {
            System.out.println("k является делителем числа b");
        }
        if (c % k == 0) {
            System.out.println("k является делителем числа c");
        }
    }
}