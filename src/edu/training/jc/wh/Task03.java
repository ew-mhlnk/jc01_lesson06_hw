package edu.training.jc.wh;

import java.util.Scanner;

public class Task03 {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите x1 для точки A: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите y1 для точки A: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Введите x2 для точки B: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите y2 для точки B: ");
        double y2 = scanner.nextDouble();
        
        scanner.close();
    
        double distanceA = Math.sqrt(x1 * x1 + y1 * y1);
        double distanceB = Math.sqrt(x2 * x2 + y2 * y2);
        
        if (distanceA < distanceB) {
            System.out.println("Точка A ближе к началу координат.");
        } else if (distanceB < distanceA) {
            System.out.println("Точка B ближе к началу координат.");
        } else {
            System.out.println("Точки A и B находятся на одинаковом расстоянии.");
        }
    }
}

