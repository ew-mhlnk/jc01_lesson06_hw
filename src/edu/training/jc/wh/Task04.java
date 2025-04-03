package edu.training.jc.wh;

public class Task04 {
    public static void main(String args[]) {
        double A = 10;  // Первый угол в градусах
        double B = 20;   // Второй угол в градусах
        
        // Вычисляем третий угол
        double C = 180 - (A + B);
        
        // Проверяем существование треугольника
        if (A > 0 && B > 0 && C > 0) {
            System.out.println("Треугольник существует");
            
            // Проверяем, является ли треугольник прямоугольным
            if (A == 90 || B == 90 || C == 90) {  // Исправлено: || вместо 
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}