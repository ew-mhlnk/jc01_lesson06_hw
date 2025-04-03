package edu.training.jc.wh;

public class Task13 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2); 
        }

        System.out.println("Сумма квадратов первых 100 чисел = " + sum);
    }
}
