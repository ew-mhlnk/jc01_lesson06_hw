package edu.training.jc.wh;

import java.util.Scanner;

public class Task01 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите площадь первого треугольника: ");
        double area1 = scanner.nextDouble();
        
        System.out.print("Введите площадь второго треугольника: ");
        double area2 = scanner.nextDouble();
        
        if (area1 > area2) {
            System.out.println("Площадь первого треугольника больше");
        } else if (area2 > area1) {
            System.out.println("Площадь второго треугольника больше");
        } else {
            System.out.println("Площади треугольников равны");
        }
        scanner.close();
    }
}