package edu.training.jc.wh;

import java.util.Scanner;

public class Task02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите " + (i + 1) + "-е число: ");
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();
        
        for (int i = 0; i < 3; i++) {
            if (numbers[i] >= 0) {
                numbers[i] = Math.pow(numbers[i], 2);  //
            } else {
                numbers[i] = Math.pow(numbers[i], 4);
            }
        }
        
        System.out.println("\nРезультаты:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "-е число: " + numbers[i]);
        }
    }
}